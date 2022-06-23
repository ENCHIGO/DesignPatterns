package com.enchigo.design.patterns.observer.observer;

public interface Subject {

    void subscribe(Observer observer);

    void unSubscribe(Observer observer);

    void notifyAllObserver();



}
