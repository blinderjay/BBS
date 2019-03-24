/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blinderjay.BBS.client.util;

import com.blinderjay.BBS.grpc.Con.bbsThread;
import java.time.LocalDate;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

/**
 *
 * @author blinderjay
 */
public class ThreadInfo {

    private SimpleStringProperty topic;
    private SimpleStringProperty context;

    private IntegerProperty id;
//    private TimeProperty time;
    private ObjectProperty<LocalDate> birthday;
    private ObjectProperty delete;
    private ObjectProperty check;
    private CheckBox checkbox;

//        private  StringProperty classname;
//        private  ObjectProperty edit;
    public ThreadInfo(bbsThread bt) {
        this();
        this.id = new SimpleIntegerProperty(bt.getTid());
        this.topic = new SimpleStringProperty(bt.getTopic());
        this.context = new SimpleStringProperty(bt.getContex());

    }

    public ThreadInfo() {
        checkbox=new CheckBox();
        this.delete = new SimpleObjectProperty(new delButton());
        this.check = new SimpleObjectProperty(checkbox);
    }

    public ThreadInfo(String topic, String context) {
        this();
        this.topic = new SimpleStringProperty(topic);
        this.context = new SimpleStringProperty(context);
    }

    public ThreadInfo settopic(String topic) {
        this.topic.set(topic);
        return this;
    }

    public String gettopic() {
        return this.topic.get();

    }

    public SimpleStringProperty contexproperty() {
        return this.context;
    }

    public ThreadInfo setcontext(String context) {
        this.context.set(context);
        return this;
    }

    public String getcontext() {
        return this.context.get();
    }

    public SimpleStringProperty topicproperty() {
        return this.topic;
    }

    public ObjectProperty DelProperty() {
        return this.delete;
    }
    
        public ObjectProperty CheckProperty() {
        return this.check;
    }
        
        public boolean getIsChecked(){
            return this.checkbox.isSelected();
        }
        
            public int getTid(){
            return this.id.get();
        }

    class delButton extends Button {

        public delButton() {
            this.setOnAction(value -> {
                ThreadUtil.delete(id.get());
            });
        }
        
    }
}
