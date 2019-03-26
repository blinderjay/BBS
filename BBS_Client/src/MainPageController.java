/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.blinderjay.BBS.client.util.bbsChannel;
import com.blinderjay.BBS.client.front.LoginDialog;
import com.blinderjay.BBS.client.util.CookieUtil;
import com.blinderjay.BBS.grpc.Con.BBS_ConGrpc;
import com.blinderjay.BBS.grpc.Con.bbsError;
import com.blinderjay.BBS.grpc.Con.userInRes;
import com.blinderjay.BBS.grpc.Con.userLoginReq;
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



    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void toforum(ActionEvent event) {
  loadforum();
    }

    @FXML
    private void toaccount(ActionEvent event) throws InterruptedException {
        if (CookieUtil.checkloged()) {
   loadaccount();
        } else {
            if (alertNotLog()) {

            }

        }
    }

    @FXML
    private void tomanage(ActionEvent event) throws InterruptedException {
        if (CookieUtil.checkloged()) {
            loadmanage();
        } else if (alertNotLog() ? CookieUtil.checkloged() : false) {
            System.out.println("login success");
            loadmanage();
        } else {
            toforum(event);
        }

    }

    public boolean alertNotLog() throws InterruptedException {

        //create dialog window
        Boolean toreturn = null;
        LoginDialog dialog = new LoginDialog();
        Optional<Pair<ButtonType, Pair<String, String>>> result = dialog.showAndWait();
        userInRes res = null;
        Pair<ButtonType, Pair<String, String>> resultV = result.get();

        //get value and handle it
        try {
            BBS_ConGrpc.BBS_ConBlockingStub blockingStub = BBS_ConGrpc.newBlockingStub(bbsChannel.getchannel());
            if (resultV.getKey() == dialog.loginButtonType) {

                userLoginReq req = userLoginReq.newBuilder()
                        .setName(resultV.getValue().getKey())
                        .setPass(resultV.getValue().getValue())
                        .build();

                res = blockingStub.userLogin(req);

                toreturn = res.getErr().getErrtype() == bbsError.errType.err0;
            } else if (resultV.getKey() == dialog.signupButtonType) {

                userRegisReq req = userRegisReq.newBuilder()
                        .setName(resultV.getValue().getKey())
                        .setPass(resultV.getValue().getValue())
                        .build();
                res = blockingStub.userRegister(req);

                toreturn = res.getErr().getErrtype() == bbsError.errType.err0;
            } else {
                toreturn = false;
            };

        } finally {
            bbsChannel.shutdown();
        }
        CookieUtil.setCookie(res.getCookie());
        return toreturn;
    }

    public void loadmanage() {
        try {
            mainbody.setCenter(FXMLLoader.load(getClass().getResource("/ManagePage.fxml")));
        } catch (IOException ex) {
            Logger.getLogger(MainPageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadaccount() {
        try {
            mainbody.setCenter(FXMLLoader.load(getClass().getResource("/AccountPage.fxml")));
        } catch (IOException ex) {
            Logger.getLogger(MainPageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadforum() {
        try {
            mainbody.setCenter(FXMLLoader.load(getClass().getResource("/ForumPage.fxml")));
        } catch (IOException ex) {
            Logger.getLogger(MainPageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
