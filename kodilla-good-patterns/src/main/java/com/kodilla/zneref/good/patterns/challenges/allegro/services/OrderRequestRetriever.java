package com.kodilla.zneref.good.patterns.challenges.allegro.services;

import com.kodilla.zneref.good.patterns.challenges.allegro.domain.OrderRequest;
import com.kodilla.zneref.good.patterns.challenges.allegro.domain.Product;
import com.kodilla.zneref.good.patterns.challenges.allegro.domain.User;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Jan",
                "Kowalski",
                "kowalsky@kowalsky.com",
                "123456789",
                "Prosta 2, 45-456 Mąciny Dolne");
        Product product = new Product("Krawat", 99.99);

        return new OrderRequest(user, product, 4);
    }
}
