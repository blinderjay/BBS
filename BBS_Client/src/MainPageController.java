/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.blinderjay.BBS.client.util.bbsChannel;
import com.blinderjay.BBS.client.util.bbsProp;
import com.blinderjay.BBS.client.front.LoginDialog;
import com.blinderjay.BBS.grpc.Con.BBS_ConGrpc;
import com.blinderjay.BBS.grpc.Con.userInRes;
import com.blinderjay.BBS.grpc.Con.userRegisReq;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.BorderPane;
import javafx.util.Pair;

/**
 *
 * @author blinderjay
 */
public class MainPageController implements Initializable {

    @FXML
    private BorderPane mainbody;

    Parent forumpage;
    Parent accountpage;
    Parent managepage;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            forumpage = FXMLLoader.load(getClass().getResource("/ForumPage.fxml"));
            accountpage = FXMLLoader.load(getClass().getResource("/AccountPage.fxml"));
            managepage = FXMLLoader.load(getClass().getResource("/ManagePage.fxml"));
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
        if (bbsProp.haslogedin()) {
            mainbody.setCenter(accountpage);
        } else {
            LoginDialog dialog = new LoginDialog();
            Optional<Pair<ButtonType, Pair<String, String>>> result = dialog.showAndWait();
            result.ifPresent(userpass -> {
                try{
                       if (userpass.getKey() == dialog.loginButtonType) {
                } else if (userpass.getKey() == dialog.signupButtonType) {
                    BBS_ConGrpc.BBS_ConBlockingStub blockingStub = BBS_ConGrpc.newBlockingStub(bbsChannel.getchannel());
                    userRegisReq req = userRegisReq.newBuilder()
                            .setName(userpass.getValue().getValue())
                            .setPass(userpass.getValue().getValue())
                            .build();
                    try {  userInRes res = blockingStub.userRegister(req); } catch (Exception e) {  }
                }else {};
                }catch(Exception e){}
            });
            try {
                bbsChannel.shutdown();
            } catch (InterruptedException ex) {
                Logger.getLogger(MainPageController.class.getName()).log(Level.SEVERE, null, ex);
            }catch(NullPointerException ex){
                Logger.getLogger(MainPageController.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }

    @FXML
    private void tomanage(ActionEvent event) {
        mainbody.setCenter(managepage);
    }

}
