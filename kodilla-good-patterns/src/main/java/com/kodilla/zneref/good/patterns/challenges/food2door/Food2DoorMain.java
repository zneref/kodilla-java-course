package com.kodilla.zneref.good.patterns.challenges.food2door;

import com.kodilla.zneref.good.patterns.challenges.food2door.model.Order;
import com.kodilla.zneref.good.patterns.challenges.food2door.model.Producers;
import com.kodilla.zneref.good.patterns.challenges.food2door.services.OrderRequestRetriever;
import com.kodilla.zneref.good.patterns.challenges.food2door.services.OrderService;
import com.kodilla.zneref.good.patterns.challenges.food2door.services.ProducerProcessor;

import java.util.List;
import java.util.Map;

public class Food2DoorMain {

    public static void main(String[] args) {
        OrderService extraFoodService = (orders) -> {
            System.out.println("Processing " + orders + " from " + Producers.EXTRA_FOOD_SHOP + "...");
            return true;
        };
        OrderService healthyFoodService = (orders) -> {
            System.out.println("Processing " + orders + " from " + Producers.HEALTHY_FOOD_SHOP + "...");
            return true;
        };
        OrderService glutenFreeFoodService = (orders) -> {
            System.out.println("Processing " + orders + " from " + Producers.GLUTEN_FREE_FOOD_SHOP + "...");
            return false;
        };

        OrderRequestRetriever requestRetriever = new OrderRequestRetriever();
        Map<String, List<Order>> orders = requestRetriever.retrieve();

        ProducerProcessor extraFoodProcessor = new ProducerProcessor(extraFoodService);
        ProducerProcessor healthyFoodProcessor = new ProducerProcessor(healthyFoodService);
        ProducerProcessor glutenFreeFoodProcessor = new ProducerProcessor(glutenFreeFoodService);

        extraFoodProcessor.process(orders.get(Producers.EXTRA_FOOD_SHOP));
        extraFoodProcessor.orderProcessResult();
        healthyFoodProcessor.process(orders.get(Producers.HEALTHY_FOOD_SHOP));
        healthyFoodProcessor.orderProcessResult();
        glutenFreeFoodProcessor.process(orders.get(Producers.GLUTEN_FREE_FOOD_SHOP));
        glutenFreeFoodProcessor.orderProcessResult();
    }
}
