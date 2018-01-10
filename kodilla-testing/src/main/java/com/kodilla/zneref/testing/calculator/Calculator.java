package com.kodilla.zneref.testing.calculator;

import com.kodilla.zneref.testing.calculator.services.Adder;
import com.kodilla.zneref.testing.calculator.services.Subtractor;

public class Calculator {
    private Adder<Integer> adder = (a, b) -> a * b; // calculator test fails
    private Subtractor<Integer> subtractor = (a, b) -> a - b;

    public int add(int a, int b) {
        return adder.add(a, b);
    }

    public int subtract(int a, int b) {
        return subtractor.subtract(a, b);
    }
}
