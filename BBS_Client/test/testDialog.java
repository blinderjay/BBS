/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.blinderjay.BBS.client.front.LoginDialog;
import java.util.Optional;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Pair;

/**
 *
 * @author blinderjay
 */
public class testDialog extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                LoginDialog ld = new LoginDialog();
                Optional<Pair<ButtonType, Pair<String, String>>> result = ld.showAndWait();

                result.ifPresent(usernamePassword -> {
                    System.out.println("Username=" + usernamePassword.getKey() + ", Password=" + usernamePassword.getValue().getKey());
                });
            }
        });

        StackPane root = new StackPane();

        root.getChildren().addAll(btn);
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
