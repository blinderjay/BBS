/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blinderjay.BBS.server;

import java.io.IOException;



/**
 *
 * @author blinderjay
 */
public class bbsServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        final bbsServer server = new bbsServer();
        GrpcServer gs = new GrpcServer(8888, new ConServicePro());
        gs.start();
        gs.blockUntilShutdown();
        
        
         
    }
    

   
        
    }

       
