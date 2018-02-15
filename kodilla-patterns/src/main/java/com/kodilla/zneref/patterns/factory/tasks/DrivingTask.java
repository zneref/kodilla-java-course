package com.kodilla.zneref.patterns.factory.tasks;

public class DrivingTask extends Task {
    private String where;
    private String using;

    public DrivingTask(String name, String where, String using) {
        super(name);
        this.where = where;
        this.using = using;
    }
}
