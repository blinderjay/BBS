/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blinderjay.BBS.client.util;

import com.blinderjay.BBS.grpc.Con.bbsCookie;

/**
 *
 * @author blinderjay
 */
public class CookieUtil {

    private static String _name="";
    private static String _value="";
    
    public static void setCookie(String name, String value) {
        _name = name;
        _value = value;

    }

    public static void setCookie(bbsCookie cookie) {
        _name = cookie.getName();
        _value = cookie.getValue();
    }

    public static bbsCookie build_bbsCookie() {
        return bbsCookie.newBuilder().setName(_name).setValue(_value).build();
    }
public static String getName(){
    return _name;
}
public static String getValue(){
    return _value;
}

public static boolean checkloged(){
    return _name.equals("_cookie")    &&    !_value.equals("");
}
}
