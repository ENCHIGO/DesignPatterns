package com.enchigo.design.patterns.observer.observer;

import java.util.List;

public class main {
    public static void main(String[] args) {
        Broadcast broadcast = new Broadcast();
        List<Observer> observers = broadcast.getObservers();
        observers.add(new Observer("1"));
        observers.add(new Observer("2"));
        observers.add(new Observer("3"));
        broadcast.publishEvent();
    }
}
