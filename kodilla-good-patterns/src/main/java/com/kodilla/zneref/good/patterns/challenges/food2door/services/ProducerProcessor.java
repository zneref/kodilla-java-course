package com.kodilla.zneref.good.patterns.challenges.food2door.services;

import com.kodilla.zneref.good.patterns.challenges.food2door.model.Order;
import com.kodilla.zneref.good.patterns.challenges.food2door.model.ProcessResult;

import java.util.List;

public class ProducerProcessor {
    private final OrderService orderService;
    private final List<Order> order;
    private boolean orderProcessResult;

    public ProducerProcessor(OrderService orderService, List<Order> order) {
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
