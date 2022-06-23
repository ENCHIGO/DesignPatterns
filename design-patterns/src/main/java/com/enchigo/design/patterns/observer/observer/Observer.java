package com.enchigo.design.patterns.observer.observer;

public class Observer {

    String value;

    public Observer(String value){
        this.value = value;
    }

    void onEvent(){
        System.out.println(value);
    }

}
