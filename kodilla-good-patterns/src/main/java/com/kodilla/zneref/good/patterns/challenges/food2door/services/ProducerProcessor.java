package com.kodilla.zneref.good.patterns.challenges.food2door.services;

import com.kodilla.zneref.good.patterns.challenges.food2door.model.Order;
import com.kodilla.zneref.good.patterns.challenges.food2door.model.ProcessResult;

import java.util.List;

public class ProducerProcessor {
    private final OrderService orderService;
    private boolean orderProcessResult;

    public ProducerProcessor(OrderService orderService) {
        this.orderService = orderService;
    }

    public void process(List<Order> orders) {
        orderProcessResult = orderService.execute(orders);
    }

    public void orderProcessResult() {
        System.out.println(orderProcessResult ? ProcessResult.SUCCESS : ProcessResult.FAILURE);
    }
}
