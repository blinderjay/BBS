/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blinderjay.BBS.client.front;

import java.awt.Stroke;
import javafx.geometry.Insets;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

/**
 *
 * @author blinderjay
 */
public class ReplyView extends BorderPane{

    TextFlow replyText;

    public ReplyView(String context){
        replyText = new TextFlow(new Text(context));
       
        replyText.setStyle("-fx-font-size: 1.5em;-fx-background-color: transparent;");
        replyText.setMinHeight(36);
        replyText.setMaxHeight(81);
        replyText.setPadding(new Insets(2));
//        replyText.setEditable(false);
//        replyText.setWrapText(true);
        this.setMaxWidth(300);
        this.setBackground(new Background(
                new BackgroundFill(
                        new Color(0.3, 0.5, 0.8, 0.5f),
                        new CornerRadii(5), new Insets(3))
        ));
                        this.setCenter(replyText);
            this.setBorder(new Border(
                    new BorderStroke(
                            new Color(0.5, 0.5, 0.7, 0.4), 
                            BorderStrokeStyle.DASHED, 
                            new CornerRadii(5),
                            BorderWidths.DEFAULT)));
    }
}
