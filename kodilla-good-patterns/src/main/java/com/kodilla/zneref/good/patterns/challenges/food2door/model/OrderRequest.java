package com.kodilla.zneref.good.patterns.challenges.food2door.model;

import com.kodilla.zneref.good.patterns.challenges.food2door.services.OrderService;

public final class OrderRequest {
    private final OrderService orderService;
    private final Order order;

    public OrderRequest(OrderService orderService, Order order) {
        this.orderService = orderService;
        this.order = order;
    }

    public OrderService getOrderService() {
        return orderService;
    }

    public Order getOrder() {
        return order;
    }
}
