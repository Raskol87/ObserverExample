package com.raskolnikov.DesignPattern.Observer.observer;

import com.raskolnikov.DesignPattern.Observer.subject.Eshop;

public class Customer extends Observer {
    @Override
    public void update() {
        System.out.println(myShop.getSubjectedItem()+myShop.getStateMessage());
    }

    public Customer(Eshop myShop){
       this.myShop = myShop;
       this.myShop.attach(this);
    }


}
