/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blinderjay.BBS.client.front;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.util.Pair;

/**
 *
 * @author blinderjay
 */
public class LoginDialog extends Dialog<Pair<ButtonType, Pair<String,String>>> {
    // Create the custom dialog.
   public final ButtonType loginButtonType;
     public final ButtonType signupButtonType;
     
    public LoginDialog() {
        this.setTitle("Login Dialog");
        this.setHeaderText("You must login with your account");
        // Set the icon (must be included in the project).
        //this.setGraphic(new ImageView(this.getClass().getResource("login.png").toString()));
        // Set the button types.
//ButtonType loginButtonType = new ButtonType("Login", ButtonData.OK_DONE);
         loginButtonType = new ButtonType("Login");
         signupButtonType = new ButtonType("Signup");
        this.getDialogPane().getButtonTypes().addAll(loginButtonType, signupButtonType, ButtonType.CANCEL);

// Create the username and password labels and fields.
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 150, 10, 10));

        TextField username = new TextField();
        username.setPromptText("Username");
        PasswordField password = new PasswordField();
        password.setPromptText("Password");

        grid.add(new Label("Username:"), 0, 0);
        grid.add(username, 1, 0);
        grid.add(new Label("Password:"), 0, 1);
        grid.add(password, 1, 1);

//Create login and signup button depending on whether a username was entered.
        Node loginButton = this.getDialogPane().lookupButton(loginButtonType);
        Node signupButton = this.getDialogPane().lookupButton(signupButtonType);
        loginButton.setDisable(true);
                signupButton.setDisable(true);

        username.textProperty().addListener((observable, oldValue, newValue) -> {
            signupButton.setDisable(newValue.trim().isEmpty() || password.getText().trim().isEmpty());
            loginButton.setDisable(newValue.trim().isEmpty() || password.getText().trim().isEmpty());
        });

        password.textProperty().addListener((observable, oldValue, newValue) -> {
            signupButton.setDisable(newValue.trim().isEmpty() || username.getText().trim().isEmpty());
            loginButton.setDisable(newValue.trim().isEmpty() || username.getText().trim().isEmpty());
        });

        this.getDialogPane().setContent(grid);

// Request focus on the username field by default.
        Platform.runLater(() -> username.requestFocus());

// Convert the result to a username-password-pair when the login button is clicked.
        this.setResultConverter(dialogButton -> {
            if (dialogButton == loginButtonType || dialogButton == loginButtonType) {
                return new Pair<>(dialogButton, new Pair<>(username.getText(), password.getText()));
            } else {
                return null;
            }
        });

    }

}
