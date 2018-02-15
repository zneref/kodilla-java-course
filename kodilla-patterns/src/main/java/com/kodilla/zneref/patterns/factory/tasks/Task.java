package com.kodilla.zneref.patterns.factory.tasks;

public abstract class Task implements TaskProcessor {

    private final String name;
    private boolean isExecuted;

    public Task(String name) {
        this.name = name;
    }

    public String getTaskName() {
        return name;
    }

    @Override
    public void executeTask() {
        isExecuted = true;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
