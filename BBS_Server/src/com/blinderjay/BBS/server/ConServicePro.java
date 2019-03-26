/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blinderjay.BBS.server;

import com.blinderjay.BBS.grpc.Con.BBS_ConGrpc;
import com.blinderjay.BBS.grpc.Con.bbsClientReq;
import com.blinderjay.BBS.grpc.Con.bbsCookie;
import com.blinderjay.BBS.grpc.Con.bbsError;
import com.blinderjay.BBS.grpc.Con.bbsThread;
import com.blinderjay.BBS.grpc.Con.userInRes;
import com.blinderjay.BBS.grpc.Con.userLoginReq;
import com.blinderjay.BBS.grpc.Con.userRegisReq;
import com.blinderjay.BBS.server.Util.sessionPool;
import com.blinderjay.sql.sqlConnection;
import io.grpc.stub.StreamObserver;
import java.sql.SQLException;
import java.util.UUID;

/**
 *
 * @author blinderjay
 */
public class ConServicePro extends BBS_ConGrpc.BBS_ConImplBase {

    @Override    //    rpc userRegister(userRegisReq) returns (userInRes){};
    public void userRegister(userRegisReq req, StreamObserver<userInRes> responseObserver) {
        //connect to database
        try (java.sql.Connection conn = new sqlConnection().connect()) {
            //try with resouce could auto close connection of resource
            //is easier than try{}finally(conn.close)

            //time to handler the request, we need to connect to sql and insert a piece of new data with the "name" got from the request
            java.sql.Statement stmt = conn.createStatement();
            userInRes res = null;
            if (!stmt.executeQuery("SELECT name FROM users ;").next()) {
                String sql = String.format("INSERT INTO `users` (`name`, `email`, `des`, `password`) VALUES ('%s', '%s', '%s', '%s')",
                        req.getName(), req.getEmail(), null, req.getPass());
                //build the response

                if (stmt.executeUpdate(sql) > 0) {
                    res = userInRes.newBuilder().setCookie(
                            sessionPool.createsession(
                                    UUID.randomUUID(),
                                    req.getName())
                    ).build();
                }
            } else {
                res = userInRes.newBuilder()
                        .setCookie(
                                bbsCookie.newBuilder().setName(null).setValue(null).build()
                        ).build();
            }
            //send the response
            responseObserver.onNext(res);
            responseObserver.onCompleted();
        } catch (SQLException ex) {
        }
    }

    @Override //    rpc userLogin(userLoginReq) returns (userInRes){};
    public void userLogin(userLoginReq req, StreamObserver<userInRes> responseObserver) {
        //connect to database

        System.out.println("got a request");
        try (java.sql.Connection conn = new sqlConnection().connect()) {            //try with resouce could auto close connection of resource,is easier than try{}finally(conn.close)
            //time to handler the request, we need to connect to sql and insert a piece of new data with the "name" got from the request
            java.sql.Statement stmt = conn.createStatement();
            java.sql.ResultSet rs = stmt.executeQuery(
                    String.format("SELECT password FROM users WHERE name='%s'", req.getName())
            );

            System.out.println("consult the password of : " + req.getName());
            userInRes res = null;
            if (rs.next() ? rs.getString("password").equals(req.getPass()) : false) {

                System.out.println("Match : " + req.getName());
                res = userInRes.newBuilder()
                        .setCookie(
                                sessionPool.createsession(
                                        UUID.randomUUID(),
                                        req.getName()))
                        .setErr(bbsError.newBuilder().setErrtype(bbsError.errType.err0))
                        .build();
                
                   System.out.println("built response" );

            } else {
                System.out.println("Password do not Match");
                res = userInRes.newBuilder()
                        .setErr(
                                bbsError.newBuilder()
                                        .setErrtype(bbsError.errType.UNRECOGNIZED)
                                        .setErrInfo("password not match")
                                        .build())
                        .build();
            }

            //send the response
            responseObserver.onNext(res);
            responseObserver.onCompleted();
        } catch (SQLException ex) {
        }
    }

    @Override
    public void getThreads(bbsClientReq req, StreamObserver<bbsThread> responseObserver) {
        //check if you are alive 
        if (sessionPool.checkalive(req.getCookie())) {
            try (java.sql.Connection conn = new sqlConnection().connect()) {
                java.sql.Statement stmt = conn.createStatement();
                java.sql.ResultSet rs = stmt.executeQuery(String.format("SELECT * FROM threads WHERE uid = %d ;",
                        sessionPool.getSession(req.getCookie()).getuid()));
                // ,sessionPool.getuid(req.getCookie())
                while (rs.next()) {
                    bbsThread res = bbsThread.newBuilder()
                            .setTid(rs.getInt("tid"))
                            .setErr(
                                    bbsError.newBuilder()
                                            .setErrtype(bbsError.errType.err0)
                                            .build())
                            .setContex(rs.getString("context"))
                            .build();
                    responseObserver.onNext(res);
                }
                responseObserver.onCompleted();
            } catch (SQLException ex) {
            }
        } else {
            responseObserver.onNext(
                    bbsThread.newBuilder()
                            .setErr(
                                    bbsError.newBuilder()
                                            .setErrtype(bbsError.errType.UNRECOGNIZED)
                                            .setErrInfo("Has not logged in")
                                            .build())
                            .build());
            

        }
    }
}

//// following 2 request do not need cookie
//    rpc userRegister(userRegisReq) returns (userInRes){};
//    rpc userLogin(userLoginReq) returns (userInRes){};
//     rpc getAllThreads(bbsClientReq) returns (stream bbsThread){};
//
//
//
////all request need cookie,and server should check it
////all the response need a error,and client should handle if(err0 or other)         
//    
//            //get info:
//    rpc getUserInfo(bbsClientReq) returns (bbsUserInfo){};
//      rpc getThreads(bbsClientReq) returns (stream bbsThread){};
//    rpc genPosts(bbsClientReq) returns (stream bbsPost){};
//            //refresh info in database
//    rpc chPassword(bbsClientReq) returns (bbsServerRes){};
//    rpc refreshUserInfo(bbsUserInfo) returns (bbsServerRes){};
//    rpc pushThread(bbsThread) returns(bbsServerRes){};
//    rpc pushPosts(bbsPost) returns(bbsServerRes){};
//            //delete info in database or server
//    rpc userLogout(bbsClientReq) returns (bbsServerRes){};
//    rpc delThread(bbsClientReq) returns (bbsServerRes){};
//    rpc delPost(bbsClientReq) returns (bbsServerRes){};
