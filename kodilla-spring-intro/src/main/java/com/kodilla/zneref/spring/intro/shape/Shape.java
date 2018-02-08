package com.kodilla.zneref.spring.intro.shape;

public interface Shape {
    default String draw() {
        return "This is a geometric figure!";
    }
}
