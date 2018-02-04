package com.kodilla.zneref.good.patterns.challenges.food2door.services;

import com.kodilla.zneref.good.patterns.challenges.food2door.model.Order;

import java.util.List;

public interface OrderService {
    boolean execute(List<Order> order);
}

