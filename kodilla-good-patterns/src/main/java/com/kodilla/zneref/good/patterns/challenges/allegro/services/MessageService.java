package com.kodilla.zneref.good.patterns.challenges.allegro.services;

import com.kodilla.zneref.good.patterns.challenges.allegro.domain.OrderRequest;

public interface MessageService {
    void sendMessage(OrderRequest orderRequest);
}
