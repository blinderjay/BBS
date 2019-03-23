/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blinderjay.sql;

import java.sql.*;

/**
 *
 * @author blinderjay
 */
public class sqlConnection {
    
    //necessary information to connect to database
    final  String JDBC_Driver ;
    final  String DB_URL;
     private final  String USER ;
    private final  String PASS ;
        Connection conn ;
        Statement stmt ;
        

    public sqlConnection(String JDBC_Driver , String DB_URL, String User, String Password) {
        this.JDBC_Driver = JDBC_Driver;
        this.DB_URL = DB_URL;
        this.USER = User;
        this.PASS = Password;
    }
    
    public Connection connect(){
        try{
           // Register JDBC driver
             Class.forName("org.mariadb.jdbc.Driver");
             // Open a connection
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
        }catch(ClassNotFoundException ex){
            System.out.println(ex);
        } catch (SQLException ex) {
             System.out.println(ex);
//            Logger.getLogger(sqlConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                    System.out.println("Connected");
        return conn;
    }
}
    


           

        
