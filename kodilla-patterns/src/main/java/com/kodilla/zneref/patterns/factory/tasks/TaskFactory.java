package com.kodilla.zneref.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "shopping";
    public static final String PAINTING = "painting";
    public static final String DRIVING = "driving";

    public final Task createTask(String task) {
        switch (task) {
            default:
            case SHOPPING:
                return new ShoppingTask(SHOPPING, "warka strong", 4);
            case PAINTING:
                return new PaintingTask(PAINTING, "blue", "sky");
            case DRIVING:
                return new DrivingTask(DRIVING, "berlin", "stop");
        }
    }
}
