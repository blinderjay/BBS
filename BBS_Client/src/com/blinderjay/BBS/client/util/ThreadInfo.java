/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blinderjay.BBS.client.util;

import java.time.LocalDate;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author blinderjay
 */
public class ThreadInfo {

    private SimpleStringProperty topic;
    private SimpleStringProperty context;

    private IntegerProperty id;
//    private TimeProperty time;
   private  ObjectProperty<LocalDate> birthday;

//        private  StringProperty classname;
//        private  ObjectProperty edit;

    public ThreadInfo() {
        this(null, null);
    }

    public ThreadInfo(String topic, String context) {
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
        
        public SimpleStringProperty contexproperty(){
            return this.context;
        }

    public ThreadInfo setcontext(String context) {
        this.context.set(context);
        return this;
    }



    public String getcontext() {
        return this.context.get();

    }
    
            public SimpleStringProperty topicproperty(){
            return this.topic;
        }
}
