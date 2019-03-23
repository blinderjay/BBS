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
import com.blinderjay.BBS.grpc.Con.userRegisReq;
import com.blinderjay.BBS.grpc.Con.userinfoReply;
import com.blinderjay.BBS.grpc.Con.userinfoReq;
import com.blinderjay.sql.sqlConnection;
import io.grpc.stub.StreamObserver;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author blinderjay
 */
class ConServicePro extends BBS_ConGrpc.BBS_ConImplBase {

    @Override
    public void userRegister(userRegisReq req, StreamObserver<userInRes> responseObserver) {

        bbsCookie cookie = bbsCookie.newBuilder().setName("iden").setValue(req.getEmail()).build();
        userInRes reply = userInRes.newBuilder().setCookie(cookie).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void getinfo(userinfoReq req, StreamObserver<userinfoReply> responseObserver) {
        userinfoReply reply = userinfoReply.newBuilder().setEmail("csdcds").build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void getThreads(bbsClientReq req, StreamObserver<bbsThread> responseObserver) {
//            bbsThread reply = bbsThread.newBuilder()
//                    .setContex("fsfdsfafafdfsfafafa")
//                    .setErr(bbsError.newBuilder().build()).build();
//            responseObserver.onNext(reply);
//            responseObserver.onCompleted();


    try {
            sqlConnection UserSql = new sqlConnection("org.mariadb.jdbc.Driver", "jdbc:mariadb://127.0.0.1/bbs", "root", "root");
            java.sql.Connection conn = UserSql.connect();

            try {
                java.sql.Statement stmt = conn.createStatement();

                java.sql.ResultSet rs = stmt.executeQuery("SELECT * FROM threads ;");

               for (;;) {
                              
                if (rs.next()) {
  
                    bbsThread reply = bbsThread.newBuilder()
                            .setContex(rs.getString("context"))
                            .build();
                    System.out.println(rs.getString("context"));
                    responseObserver.onNext(reply);
                }
                else{
                                 responseObserver.onCompleted();
                                  System.out.println(rs.getString("no context"));
                }
            }
        } finally {
                conn.close();
            }
    }catch (SQLException ex) {
        }

    }
}








   