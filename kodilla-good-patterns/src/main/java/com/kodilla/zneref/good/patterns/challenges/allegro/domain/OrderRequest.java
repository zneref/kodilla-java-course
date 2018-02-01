package com.kodilla.zneref.good.patterns.challenges.allegro.domain;

public class OrderRequest {
    private User user;
    private Product product;
    private int productQuantity;

    public OrderRequest(User user, Product product, int productQuantity) {
        this.user = user;
        this.product = product;
        this.productQuantity = productQuantity;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}
