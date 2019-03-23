/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.blinderjay.BBS.client.front.ThreadView;
import com.blinderjay.BBS.grpc.Con.bbsThread;
import com.blinderjay.BBS.grpc.Con.bbsThreadOrBuilder;
import com.blinderjay.BBS.grpc.Con.bbsTime;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author blinderjay
 */
public class testThreadV extends Application {
    
    @Override
    public void start(Stage primaryStage) {
  
       ThreadView thread =new ThreadView(bbsThread.
                newBuilder().
                setContex("sdcsd彩色的vcdscdcdddddddddddddddddddddddddddc")
        .setTopic("csdcd")
        .setTime(bbsTime.newBuilder()
                .setDay(3)
                .setHour(3)
                .setMinute(43)
                .setMonth(5)
                .setSecond(3)
                .setYear(54)
                .build())
                .setUser("sd")
                .build());
        thread.addreply("helowbhbjbjkbkbkjbkbj");
                thread.addreply("helowbhbjcsdcsdcavdafvadfvbbjkbkbkjbkbj");
        AnchorPane root = new AnchorPane();

        root.getChildren().addAll(thread);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
