package com.kodilla.zneref.good.patterns.challenges.allegro;

import com.kodilla.zneref.good.patterns.challenges.allegro.domain.OrderRequest;
import com.kodilla.zneref.good.patterns.challenges.allegro.services.OrderRequestRetriever;

public class AllegroMain {

    public static void main(String[] args) {
        OrderRequestRetriever retriever = new OrderRequestRetriever();
        OrderRequest orderRequest = retriever.retrieve();
        ProductOrderProcessor orderProcessor = new ProductOrderProcessor(
                order -> System.out.println("Order\n" + order.getProduct() + "\n" + order.getUser() + "\ncompleted!"),
                order -> true,
                order -> true
        );

        orderProcessor.process(orderRequest);
    }
}
