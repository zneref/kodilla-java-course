package com.kodilla.zneref.patterns2.decorator.pizza;

public abstract class PizzaDecorator implements Pizza {
    private final Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public float cost() {
        return pizza.cost();
    }

    @Override
    public String description() {
        return pizza.description();
    }

    @Override
    public int size() {
        return pizza.size();
    }
}
