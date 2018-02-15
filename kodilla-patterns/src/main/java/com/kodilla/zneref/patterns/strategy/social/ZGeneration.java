package com.kodilla.zneref.patterns.strategy.social;

public class ZGeneration extends User {
    public ZGeneration(String name) {
        super(name);
        this.publisher = () -> "Snapchat";
    }
}
