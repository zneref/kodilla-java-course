package com.kodilla.zneref.patterns.factory.tasks;

public class PaintingTask extends Task {
    private String color;
    private String whatToPaint;

    public PaintingTask(String name, String color, String whatToPaint) {
        super(name);
        this.color = color;
        this.whatToPaint = whatToPaint;
    }
}
