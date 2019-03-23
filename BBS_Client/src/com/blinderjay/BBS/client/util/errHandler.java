/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blinderjay.BBS.client.util;

import com.blinderjay.BBS.grpc.Con.bbsError;
import com.blinderjay.BBS.grpc.Con.userInRes;
import javafx.scene.control.Alert;

/**
 *
 * @author blinderjay
 */
public class errHandler {
    private  bbsError err;
    
//    public errHandler(bbsError err){
//        this.err = err;
//    }
   public errHandler(userInRes res){
            if(res.hasErr()){
                        this.err = res.getErr();
            }
    }
    public void alertErr (){
                                 Alert alert = new Alert(Alert.AlertType.ERROR);
                                alert.setTitle("Got an error");
                                alert.setHeaderText(err.getErrInfo()+err.getErrtype().name());
                                alert.showAndWait();
    }
}
