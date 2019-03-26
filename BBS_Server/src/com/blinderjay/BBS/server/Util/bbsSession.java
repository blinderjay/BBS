/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blinderjay.BBS.server.Util;

import com.blinderjay.sql.sqlConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author blinderjay
 */
public class bbsSession {

    private UUID uuid;
    private userStatus status = userStatus.Offline;
    private String name;
    private int uid;

    ;
    private Connection conn;

    public bbsSession(UUID uuid, String name, userStatus status) {
        this(uuid, name);
        this.status = status;
    }

    public bbsSession(UUID uuid, String name) {
        try ( java.sql.ResultSet rs =
                new sqlConnection().connect().createStatement()
                        .executeQuery(String.format("SELECT `uid` FROM `users` WHERE `name` ='%s'", name))){
               System.out.println("has consult the database");
               if (rs.next()){
                      System.out.println("has got  the uid from database to create the session : "+rs.getInt("uid"));
                    this.uid=rs.getInt("uid");
               }
           
        } catch (SQLException ex) {
            Logger.getLogger(bbsSession.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.name = name;
        this.uuid = uuid;
    }

    protected boolean checkalive() {
        if (status == userStatus.Alive) {
            return true;
        } else {
            return false;
        }

    }

    public void setalive() {
        this.status = userStatus.Alive;
    }

    public void setoffline() {
        this.status = userStatus.Offline;
    }
    
    public int getuid(){
        return uid;
    }
        public String getname(){
        return name;
    }

}
