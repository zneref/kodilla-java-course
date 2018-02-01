package com.kodilla.zneref.good.patterns.challenges.food2door.model;

import com.kodilla.zneref.good.patterns.challenges.food2door.services.OrderService;

public class ExtraFoodShop extends Producer {
    private String producer;

    public ExtraFoodShop(OrderService orderService, String producer) {
        super(orderService);
        this.producer = producer;
    }

    @Override
    public void process(Order order) {
        System.out.println("Processing " + order + " from \'" + producer + "\' producer.");
        orderProcessResult = orderService.execute(order);
    }
}
