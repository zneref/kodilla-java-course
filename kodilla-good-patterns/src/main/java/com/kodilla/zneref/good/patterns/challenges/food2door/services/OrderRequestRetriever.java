package com.kodilla.zneref.good.patterns.challenges.food2door.services;

import com.kodilla.zneref.good.patterns.challenges.food2door.model.Order;
import com.kodilla.zneref.good.patterns.challenges.food2door.model.Product;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRequestRetriever {
    private final Map<OrderService, List<Order>> orderRequests;

    public OrderRequestRetriever() {
        orderRequests = new HashMap<>();

        OrderService extraFoodService = order -> {
            System.out.println("Processing " + order + " from \'ExtraFoodShop\'...");
            return true;
        };
        OrderService healthyFoodService = order -> {
            System.out.println("Processing " + order + " from \'HealthyFoodShop\'...");
            return true;
        };
        OrderService glutenFreeService = order -> {
            System.out.println("Processing " + order + " from \'GlutenFreeShop\'...");
            return false;
        };

        List<Order> extraFoodOrders = Arrays.asList(
                new Order(new Product("Mleko kozie", 3.49), 2),
                new Order(new Product("Ser owczy", 23.49), 2));
        List<Order> healthyFoodOrders = Arrays.asList(
                new Order(new Product("Miód pszczeli", 45.20), 1),
                new Order(new Product("Chleb razowy", 4.30), 2));
        List<Order> glutenFreeOrders = Arrays.asList(
                new Order(new Product("Mąka bezglutenowa", 1.49), 5),
                new Order(new Product("Wafle ryżowe", 5.00), 10));

        orderRequests.put(extraFoodService, extraFoodOrders);
        orderRequests.put(healthyFoodService, healthyFoodOrders);
        orderRequests.put(glutenFreeService, glutenFreeOrders);
    }

    public Map<OrderService, List<Order>> retrieve() {
        return new HashMap<>(orderRequests);
    }
}
