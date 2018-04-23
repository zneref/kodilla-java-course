package com.kodilla.zneref.patterns2.decorator.pizza;

public class PizzaVegetariana extends PizzaDecorator {
    public PizzaVegetariana(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String description() {
        return super.description() + " and olives";
    }

    @Override
    public float cost() {
        return super.cost() + 4.99f;
    }

}
