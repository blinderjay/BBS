/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blinderjay.BBS.client.front;

import com.blinderjay.BBS.grpc.Con.bbsThread;
import javafx.geometry.Insets;
import javafx.scene.control.Accordion;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

/**
 *
 * @author blinderjay
 */
public class ThreadView extends BorderPane {

    bbsThread thread;
    Accordion moreView;
    TextArea threadview;
    ScrollPane replyview;
    TextField myreply;
    VBox replies;

    public ThreadView(bbsThread thread) {
        this.thread = thread;
        myreply = new TextField("input your reply");
        replies = new VBox();
        replyview = new ScrollPane(replies);
        threadview = new TextArea();
        
        
        replies.setSpacing(5);
        replies.setPadding(new Insets(4));
replies.setFillWidth(false);

threadview.setBorder(new Border(
                    new BorderStroke(
                            new Color(0.5, 0.5, 0.7, 0.4), 
                            BorderStrokeStyle.DASHED, 
                            new CornerRadii(5),
                            BorderWidths.DEFAULT)));
replyview.setBorder(new Border(
                    new BorderStroke(
                            new Color(0.5, 0.5, 0.7, 0.4), 
                            BorderStrokeStyle.DASHED, 
                            new CornerRadii(10),
                            BorderWidths.DEFAULT)));

        try {
            threadview.setText(thread.getContex());
        

        } catch (Exception e) {
            threadview.setText("can not get context of the thread");
        }
        threadview.setStyle("-fx-font-size: 1.5em;-fx-background-color: transparent;");
        threadview.setMinHeight(25);
        threadview.setPrefHeight(39);
        threadview.setMaxHeight(81);
        threadview.setEditable(false);
        threadview.setWrapText(true);

        TitledPane readmore = new TitledPane("learn more", new BorderPane(null, replyview, null, myreply, null));
        moreView = new Accordion(readmore);
        this.setTop(threadview);
        this.setBottom(moreView);
        this.setBackground(new Background(
                new BackgroundFill(new Color(0.3, 0.5, 0.8, 0.5f), CornerRadii.EMPTY, Insets.EMPTY)
        ));

        this.setPadding(new Insets(25));
          this.setBackground(new Background(
                new BackgroundFill(
                        new Color(0.3, 0.5, 0.8, 0.5f),
                        new CornerRadii(16), new Insets(15))
        ));
          
               
//this.setPrefHeight(40);
//this.setMinHeight(USE_PREF_SIZE);
//        this.setMaxWidth(512);
//        this.setPrefWidth(356);
   }
    
    public void addreply (String reply){
        replies.getChildren().add(new ReplyView(reply));
    }

}
