/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blinderjay.BBS.client.util;

import com.blinderjay.BBS.client.front.ThreadView;
import com.blinderjay.BBS.grpc.Con.BBS_ConGrpc;
import com.blinderjay.BBS.grpc.Con.bbsClientReq;
import com.blinderjay.BBS.grpc.Con.bbsCookie;
import com.blinderjay.BBS.grpc.Con.bbsError;
import com.blinderjay.BBS.grpc.Con.bbsServerRes;
import com.blinderjay.BBS.grpc.Con.bbsThread;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author blinderjay
 */
public class ThreadUtil {

//    public ThreadUtil(bbsThread bt){
//        
//    }
    public static boolean delete(bbsThread bt) {

        return delete(bt.getTid()) ? true : false;

    }

    public static boolean delete(int tid) {
        BBS_ConGrpc.BBS_ConBlockingStub blockingStub = BBS_ConGrpc.newBlockingStub(bbsChannel.getchannel());
        bbsClientReq req = bbsClientReq.newBuilder().setCookie(CookieUtil.build_bbsCookie()).setReqtype(bbsClientReq.reqType.delThread).setArg(String.valueOf(tid)).build();
        bbsServerRes resp = blockingStub.delThread(req);
        try {
            bbsChannel.shutdown();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resp.getErr().getErrtype() == bbsError.errType.err0 ? true : false;

    }
}
