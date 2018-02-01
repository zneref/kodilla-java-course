package com.kodilla.zneref.good.patterns.challenges.food2door.model;

import com.kodilla.zneref.good.patterns.challenges.food2door.services.OrderService;

public abstract class Producer {
    OrderService orderService;
    boolean orderProcessResult;

    public Producer(OrderService orderService) {
        this.orderService = orderService;
    }

    public abstract void process(Order order);

    public void orderProcessResult() {
        System.out.println(orderProcessResult ? ProcessResult.SUCCESS : ProcessResult.FAILURE);
    }
}
