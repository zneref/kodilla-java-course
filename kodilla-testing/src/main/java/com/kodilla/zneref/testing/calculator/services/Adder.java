package com.kodilla.zneref.testing.calculator.services;

public interface Adder<T> {
    T add(T a, T b);
}
