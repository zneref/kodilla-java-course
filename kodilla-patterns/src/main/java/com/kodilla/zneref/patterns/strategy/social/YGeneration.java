package com.kodilla.zneref.patterns.strategy.social;

public class YGeneration extends User{

    public YGeneration(String name) {
        super(name);
        this.publisher = () -> "Twitter";
    }
}
