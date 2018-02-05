package com.kodilla.zneref.good.patterns.challenges.food2door.services;

import com.kodilla.zneref.good.patterns.challenges.food2door.model.Order;
import com.kodilla.zneref.good.patterns.challenges.food2door.model.Producers;
import com.kodilla.zneref.good.patterns.challenges.food2door.model.Product;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRequestRetriever {
    private final Map<String, List<Order>> orderRequests;

    public OrderRequestRetriever() {
        orderRequests = new HashMap<>();


        List<Order> extraFoodOrders = Arrays.asList(
                new Order(new Product("Mleko kozie", 3.49), 2),
                new Order(new Product("Ser owczy", 23.49), 2));
        List<Order> healthyFoodOrders = Arrays.asList(
                new Order(new Product("Miód pszczeli", 45.20), 1),
                new Order(new Product("Chleb razowy", 4.30), 2));
        List<Order> glutenFreeOrders = Arrays.asList(
                new Order(new Product("Mąka bezglutenowa", 1.49), 5),
                new Order(new Product("Wafle ryżowe", 5.00), 10));

        orderRequests.put(Producers.EXTRA_FOOD_SHOP, extraFoodOrders);
        orderRequests.put(Producers.HEALTHY_FOOD_SHOP, healthyFoodOrders);
        orderRequests.put(Producers.GLUTEN_FREE_FOOD_SHOP, glutenFreeOrders);
    }

    public Map<String, List<Order>> retrieve() {
        return new HashMap<>(orderRequests);
    }
}
