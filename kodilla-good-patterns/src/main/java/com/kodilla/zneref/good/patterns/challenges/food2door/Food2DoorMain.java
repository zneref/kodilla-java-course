package com.kodilla.zneref.good.patterns.challenges.food2door;

import com.kodilla.zneref.good.patterns.challenges.food2door.model.Order;
import com.kodilla.zneref.good.patterns.challenges.food2door.services.OrderRequestRetriever;
import com.kodilla.zneref.good.patterns.challenges.food2door.services.OrderService;
import com.kodilla.zneref.good.patterns.challenges.food2door.services.ProducerProcessor;

import java.util.List;
import java.util.Map;

public class Food2DoorMain {

    public static void main(String[] args) {
        OrderRequestRetriever requestRetriever = new OrderRequestRetriever();
        Map<OrderService, List<Order>> orders = requestRetriever.retrieve();
        for (Map.Entry<OrderService, List<Order>> e : orders.entrySet()) {
            ProducerProcessor producerProcessor = new ProducerProcessor(e.getKey(), e.getValue());
            producerProcessor.process();
            producerProcessor.orderProcessResult();
        }
    }
}
