/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blinderjay.BBS.server.Util;

import com.blinderjay.BBS.grpc.Con.bbsCookie;
import java.util.HashMap;
import java.util.UUID;

/**
 *
 * @author blinderjay
 */
public class sessionPool {

    private static HashMap<UUID, bbsSession> sessionpool;

    public static bbsCookie createsession(UUID uuid, String name) {
        sessionpool.put(uuid, new bbsSession(uuid, name, userStatus.Alive));
        return bbsCookie.newBuilder().setName("_cookie").setValue(uuid.toString()).build();
    }

    public static void removesession(UUID uuid) {
        sessionpool.remove(uuid);
    }

    public static void removesession(String uuid) {
        sessionpool.remove(UUID.fromString(uuid));
    }

    public static boolean checkalive(UUID uuid) {
        return sessionpool.get(uuid).checkalive();
    }

    public static boolean checkalive(String uuid) {
        return sessionpool.get(UUID.fromString(uuid)).checkalive();
    }

    public static boolean checkalive(bbsCookie cookie) {
        return cookie.getName().equals("_cooke")
                ? checkalive(cookie.getValue())
                : false;
    }
    
   public static bbsSession getSession(bbsCookie cookie){
       return sessionpool.get(UUID.fromString(cookie.getValue()));
   }
   
      public static int getuid(bbsCookie cookie){
          return sessionpool.get(cookie.getValue()).getuid();
   }

    public static void setalive(UUID uuid) {
        sessionpool.get(uuid).setalive();
    }
}
