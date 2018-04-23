package com.kodilla.zneref.patterns2.observer.homework;

import java.util.Deque;

public class Mentor implements Observer {
    private final String username;
    private int counter;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(HomeworkQueue homeworkQueue) {
        Deque<String> solutions = homeworkQueue.getHomeworks();
        System.out.println(getUsername() + ": New solution: " + solutions.peekLast()
                + " added to " + homeworkQueue.getLearner() + " homework queue"
                + " (total: " + ++counter + " fresh solutions)");
    }

    public String getUsername() {
        return username;
    }

    public int getCounter() {
        return counter;
    }
}
