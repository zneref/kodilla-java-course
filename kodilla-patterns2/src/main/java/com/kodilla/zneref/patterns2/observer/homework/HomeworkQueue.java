package com.kodilla.zneref.patterns2.observer.homework;


import java.util.*;

public class HomeworkQueue implements Observable {
    private final String learner;
    private final Deque<String> homeworks;
    private Observer observer;

    public HomeworkQueue(String learner) {
        this.learner = learner;
        homeworks = new ArrayDeque<>();
    }

    public void registryObserver(Observer observer) {
        this.observer = observer;
    }

    public void notifyObserver() {
        observer.update(this);
    }

    public void addHomework(String homework) {
        homeworks.offer(homework);
        notifyObserver();
    }

    public String getLearner() {
        return learner;
    }

    public Deque<String> getHomeworks() {
        return homeworks;
    }
}
