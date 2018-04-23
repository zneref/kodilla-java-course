package com.kodilla.zneref.patterns2.decorator.pizza;

public class PizzaDiabloSauce extends PizzaDecorator {
    public PizzaDiabloSauce(Pizza pizza) {
        super(pizza);
    }

    @Override
    public float cost() {
        return super.cost() + 1.99f;
    }

    @Override
    public String description() {
        return super.description() + " and hot sauce";
    }
}
