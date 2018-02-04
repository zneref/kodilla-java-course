package com.kodilla.zneref.good.patterns.challenges.food2door.services;

import com.kodilla.zneref.good.patterns.challenges.food2door.model.Order;
import com.kodilla.zneref.good.patterns.challenges.food2door.model.ProcessResult;

public class ProducerProcessor {
    private final OrderService orderService;
    private final Order order;
    private boolean orderProcessResult;

    public ProducerProcessor(OrderService orderService, Order order) {
        this.orderService = orderService;
        this.order = order;
    }

    public void process() {
        orderProcessResult = orderService.execute(order);
    }

    public void orderProcessResult() {
        System.out.println(orderProcessResult ? ProcessResult.SUCCESS : ProcessResult.FAILURE);
    }
}
