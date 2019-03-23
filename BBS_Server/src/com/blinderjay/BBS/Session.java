/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blinderjay.BBS;

import com.blinderjay.sql.sqlConnection;
import java.sql.SQLException;
import java.util.Date;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author blinderjay
 */
public class Session {


    private final UUID uuid;
    private final String email;
    private Date createAt;
    private int id;

    public Session(String email,sqlConnection UserSql) throws SQLException {
        uuid = UUID.randomUUID();
        this.email = email;
                    java.sql.Connection conn = UserSql.connect();
            try {
                
            } finally {
                conn.close();
            }
    }

    
    }


