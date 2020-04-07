package com.raskolnikov.DesignPattern.Observer;

import com.raskolnikov.DesignPattern.Observer.observer.Customer;
import com.raskolnikov.DesignPattern.Observer.observer.Observer;
import com.raskolnikov.DesignPattern.Observer.subject.Eshop;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Eshop shop=new Eshop();

        for (int i = 0; i < 500; i++) {
           new Customer(shop);
                            };

        shop.setSubjectedItem("Apple");
        shop.setStateMessage(" is available");
        shop.setStateMessage(" is about to get higher price");
        shop.setStateMessage(" price is going to go up");
        shop.setStateMessage(" is out of stock");
    }



    }

