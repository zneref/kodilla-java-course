package com.kodilla.zneref.patterns2.observer.homework;

public interface Observable {
    void registryObserver(Observer observer);
    void notifyObserver();
}
