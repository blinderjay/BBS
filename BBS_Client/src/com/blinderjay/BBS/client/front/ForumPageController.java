/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blinderjay.BBS.client.front;

import com.blinderjay.BBS.client.back.GrpcService;
import com.blinderjay.BBS.grpc.Con.BBS_ConGrpc;
import com.blinderjay.BBS.grpc.Con.bbsClientReq;
import com.blinderjay.BBS.grpc.Con.bbsCookie;
import com.blinderjay.BBS.grpc.Con.bbsThread;
import com.blinderjay.BBS.grpc.Con.userinfoReply;
import com.blinderjay.BBS.grpc.Con.userinfoReq;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author blinderjay
 */
public class ForumPageController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    
    @FXML
    VBox threadlist;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ThreadView tInit = new ThreadView( bbsThread.newBuilder().setContex("this is first one").build());
        tInit.addreply("csdcsdcsd");
        tInit.addreply("hellow world");
        threadlist.getChildren().add(tInit );
        threadlist.setPadding(new Insets(27));
    }    
    
    @FXML
   private void       showThreads(ActionEvent event){
 ManagedChannel channel = ManagedChannelBuilder.forAddress("127.0.0.1", 8888).usePlaintext().build() ;
System.out.println("success to build channel");
BBS_ConGrpc.BBS_ConBlockingStub blockingStub  = BBS_ConGrpc.newBlockingStub(channel);
System.out.println("success to build blockingStub");
bbsClientReq req = bbsClientReq.newBuilder().setArg("cd").build();
        Iterator<bbsThread> resp = blockingStub.getThreads(req);
        for (;;){
            if(resp.hasNext()){
                ThreadView tv = new ThreadView(resp.next());
                tv.addreply("vfdvsdfvsdfvfdvs");
                 threadlist.getChildren().add(tv);  
                        System.out.println("success to built thread"); 
            }
            else {
                break;
            }
         
        }


    //    public void shutdown() throws InterruptedException {
//        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
//    }
    }
       
       
       
   }
    

