package com.kodilla.zneref.good.patterns.challenges.allegro;

import com.kodilla.zneref.good.patterns.challenges.allegro.domain.OrderRequest;
import com.kodilla.zneref.good.patterns.challenges.allegro.services.MessageService;
import com.kodilla.zneref.good.patterns.challenges.allegro.services.OrderRepository;
import com.kodilla.zneref.good.patterns.challenges.allegro.services.OrderService;

public class ProductOrderProcessor {
    private MessageService messageService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderProcessor(MessageService messageService, OrderService orderService, OrderRepository orderRepository) {
        this.messageService = messageService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    void process(OrderRequest orderRequest) {
        if (orderRepository.createOrder(orderRequest)) {
            orderService.execute(orderRequest);
            messageService.sendMessage(orderRequest);
        }
    }
}
