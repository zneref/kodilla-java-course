package com.kodilla.zneref.good.patterns.challenges.food2door.services;

import com.kodilla.zneref.good.patterns.challenges.food2door.model.Order;
import com.kodilla.zneref.good.patterns.challenges.food2door.model.OrderRequest;
import com.kodilla.zneref.good.patterns.challenges.food2door.model.Product;

import java.util.ArrayList;
import java.util.List;

public class OrderRequestRetriever {
    private final List<OrderRequest> orderRequests;

    public OrderRequestRetriever() {
        orderRequests = new ArrayList<>();
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
        Order extraFoodOrder = new Order(new Product("Mleko kozie", 3.49), 2);
        Order healthyFoodOrder = new Order(new Product("Miód pszczeli", 45.20), 1);
        Order glutenFreeOrder = new Order(new Product("Mąka bezglutenowa", 1.49), 5);

        orderRequests.add(new OrderRequest(extraFoodService, extraFoodOrder));
        orderRequests.add(new OrderRequest(healthyFoodService, healthyFoodOrder));
        orderRequests.add(new OrderRequest(glutenFreeService, glutenFreeOrder));
    }

    public List<OrderRequest> retrieve() {
        return new ArrayList<>(orderRequests);
    }
}
