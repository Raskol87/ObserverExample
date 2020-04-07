package com.raskolnikov.DesignPattern.Observer.subject;

import com.raskolnikov.DesignPattern.Observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;


public class Eshop {

  private  List<Observer> customers=new ArrayList();

  private String stateMessage;
  private String subjectedItem;


  public void attach(Observer obs){
      customers.add(obs);
  }

    public String getStateMessage() {
        return stateMessage;
    }

    public void setStateMessage(String stateMessage) {
        this.stateMessage = stateMessage;
        notifyAllCustomers();
    }

    public String getSubjectedItem() {
        return subjectedItem;
    }

    public void setSubjectedItem(String subjectedItem) {
        this.subjectedItem = subjectedItem;
        this.setStateMessage(" is going to be available");
        notifyAllCustomers();
    }

    public void notifyAllCustomers(){

        for (Observer obs:  customers             ) {
obs.update();
        }

    }
}
