/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blinderjay.BBS.server;

import com.blinderjay.BBS.grpc.Con.BBS_ConGrpc;
import com.blinderjay.BBS.grpc.Con.bbsCookie;
import com.blinderjay.BBS.grpc.Con.bbsCookieOrBuilder;
import com.blinderjay.BBS.grpc.Con.userInRes;
import com.blinderjay.BBS.grpc.Con.userRegisReq;
import com.blinderjay.BBS.grpc.Con.userinfoReply;
import com.blinderjay.BBS.grpc.Con.userinfoReq;
import io.grpc.stub.StreamObserver;

/**
 *
 * @author blinderjay
 */
public class ConServiceLite {

    public static class ConServiceImp extends BBS_ConGrpc.BBS_ConImplBase {


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
    }
}
