package com.kodilla.zneref.good.patterns.challenges.food2door.model;

import com.kodilla.zneref.good.patterns.challenges.food2door.services.OrderService;

public class HealthyShop extends Producer {
    private String name;

    public HealthyShop(OrderService orderService, String name) {
        super(orderService);
        this.name = name;
    }

    @Override
    public void process(Order order) {

    }
}
