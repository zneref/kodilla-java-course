package com.kodilla.zneref.patterns.factory.tasks;

public class ShoppingTask extends Task {
    private String whatToBuy;
    private double quantity;

    public ShoppingTask(String name, String whatToBuy, double quntity) {
        super(name);
        this.whatToBuy = whatToBuy;
        this.quantity = quntity;
    }
}
