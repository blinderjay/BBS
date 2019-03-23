/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.blinderjay.BBS.client.util.bbsChannel;
import com.blinderjay.BBS.client.front.ThreadView;
import com.blinderjay.BBS.grpc.Con.BBS_ConGrpc;
import com.blinderjay.BBS.grpc.Con.bbsClientReq;
import com.blinderjay.BBS.grpc.Con.bbsThread;
import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;
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
        ThreadView tInit = new ThreadView(bbsThread.newBuilder().setContex("this is first one").build());
        tInit.addreply("csdcsdcsd");
        tInit.addreply("hellow world");
        threadlist.getChildren().add(tInit);
        threadlist.setPadding(new Insets(27));
    }

    @FXML
    private void showThreads(ActionEvent event) throws InterruptedException {
        BBS_ConGrpc.BBS_ConBlockingStub blockingStub = BBS_ConGrpc.newBlockingStub(bbsChannel.getchannel());
        
        bbsClientReq req = bbsClientReq.newBuilder().setArg("cd").build();
        Iterator<bbsThread> resp = blockingStub.getThreads(req);
        while (resp.hasNext()) {
            ThreadView tv = new ThreadView(resp.next());
            tv.addreply("vfdvsdfvsdfvfdvs");
            threadlist.getChildren().add(tv);
            System.out.println("success to built thread");
        }
        
        bbsChannel.shutdown();
    }
}
