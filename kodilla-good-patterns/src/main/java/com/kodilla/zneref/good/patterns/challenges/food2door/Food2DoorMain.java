package com.kodilla.zneref.good.patterns.challenges.food2door;

import com.kodilla.zneref.good.patterns.challenges.food2door.model.OrderRequest;
import com.kodilla.zneref.good.patterns.challenges.food2door.services.OrderRequestRetriever;
import com.kodilla.zneref.good.patterns.challenges.food2door.services.ProducerProcessor;

import java.util.List;

public class Food2DoorMain {

    public static void main(String[] args) {
        OrderRequestRetriever requestRetriever = new OrderRequestRetriever();
        List<OrderRequest> orders = requestRetriever.retrieve();
        for (OrderRequest o : orders) {
            ProducerProcessor producerProcessor = new ProducerProcessor(o.getOrderService(), o.getOrder());
            producerProcessor.process();
            producerProcessor.orderProcessResult();
        }
    }
}
