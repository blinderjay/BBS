package com.blinderjay.BBS.client.util;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blinderjay
 */
public class bbsProp {
    private static boolean logedin = false;
    public static void setlogedin(boolean boo ){
        logedin = boo;
    }
        public static boolean haslogedin( ){
       return  logedin ;
    }
        public static void togglelogedin(){
             logedin =!logedin ;
        }
}
