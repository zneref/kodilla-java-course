package com.kodilla.zneref.good.patterns.challenges.food2door;

import com.kodilla.zneref.good.patterns.challenges.food2door.model.ExtraFoodShop;
import com.kodilla.zneref.good.patterns.challenges.food2door.model.Order;
import com.kodilla.zneref.good.patterns.challenges.food2door.model.Producer;
import com.kodilla.zneref.good.patterns.challenges.food2door.model.Product;
import com.kodilla.zneref.good.patterns.challenges.food2door.services.ExtraFoodShopOrderService;
import com.kodilla.zneref.good.patterns.challenges.food2door.services.OrderService;

public class Food2DoorMain {
    public static void main(String[] args) {
        OrderService extraFoodShopOrderService = new ExtraFoodShopOrderService();
        OrderService healthyShopOrderService = order -> true;
        OrderService glutenFreeShopOrderService = order -> false;

        Producer extraFoodShop = new ExtraFoodShop(extraFoodShopOrderService, "ExtraFoodShop");
        extraFoodShop.process(new Order(new Product("Mleko kozie", 3.49), 2));
        extraFoodShop.orderProcessResult();

        Producer healthyShopProducer = new ExtraFoodShop(healthyShopOrderService, "HealthyShop");
        healthyShopProducer.process(new Order(new Product("Miód pszczeli", 45.20), 1));
        healthyShopProducer.orderProcessResult();

    }
}
