package com.enchigo.design.patterns.observer.observer;


import com.google.common.collect.Lists;

import java.util.List;

public class Broadcast implements Subject {


    List<Observer> observers = Lists.newArrayList();

    public List<Observer> getObservers() {
        return observers;
    }

    public void publishEvent(){
        notifyAllObserver();
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        observers.stream().forEach(Observer::onEvent);
    }
}
