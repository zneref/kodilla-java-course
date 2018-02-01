package com.kodilla.zneref.good.patterns.challenges.food2door.model;

public class Order {
    private Product product;
    private int productQuantity;

    public Order(Product product, int productQuantity) {
        this.product = product;
        this.productQuantity = productQuantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "product=" + product +
                ", productQuantity=" + productQuantity +
                '}';
    }
}
