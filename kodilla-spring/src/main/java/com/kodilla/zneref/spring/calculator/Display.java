package com.kodilla.zneref.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Display {
    
    public void displayValue(double value) {System.out.println("Result=" + value);}
}
