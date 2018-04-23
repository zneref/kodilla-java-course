package com.kodilla.zneref.patterns2.facade;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class Authenticator {
    public boolean isAuthenticated(Long userId) {
        Random ran = new Random();
        return ran.nextBoolean();
    }
}
