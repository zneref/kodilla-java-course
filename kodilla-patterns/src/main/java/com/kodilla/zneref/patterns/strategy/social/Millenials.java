package com.kodilla.zneref.patterns.strategy.social;

public class Millenials extends User {
    public Millenials(String name) {
        super(name);
        this.publisher = () -> "Facebook";
    }
}
