/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blinderjay.BBS.client.front;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author blinderjay
 */
public class MainPageController implements Initializable {
 

    @FXML
    private  BorderPane  mainbody;
    
    Parent forumpage;
        Parent accountpage;
                Parent managepage;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
             forumpage = FXMLLoader.load(getClass().getResource("/com/blinderjay/BBS/client/front/ForumPage.fxml"));
             accountpage = FXMLLoader.load(getClass().getResource("/com/blinderjay/BBS/client/front/AccountPage.fxml"));
             managepage = FXMLLoader.load(getClass().getResource("/com/blinderjay/BBS/client/front/ManagePage.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(MainPageController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }    

    @FXML
    private void toforum(ActionEvent event) {
        mainbody.setCenter(forumpage);
    }
    
        @FXML
    private void toaccount(ActionEvent event) {
            Alert log = new Alert(Alert.AlertType.INFORMATION);
        mainbody.setCenter(accountpage);
    }
    
        @FXML
    private void tomanage(ActionEvent event) {
        mainbody.setCenter(managepage);
    }
    
    
}
