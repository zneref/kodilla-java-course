package com.kodilla.zneref.patterns2.decorator.pizza;

public class BasicPizza implements Pizza {
    private int size;
    private final int SIZE_SMALL = 10;
    private final int SIZE_MEDIUM = 20;
    private final int SIZE_BIG = 30;

    public BasicPizza(int size) {
        this.size = size;
    }

    @Override
    public float cost() {
        switch (size) {
            case SIZE_SMALL:
                return 9.99f;
            case SIZE_MEDIUM:
                return 14.99f;
            case SIZE_BIG:
                return 19.99f;
            default:
                return 9.99f;
        }
    }

    @Override
    public String description() {
        return "Pizza with cheese";
    }

    @Override
    public int size() {
        return size;
    }
}
