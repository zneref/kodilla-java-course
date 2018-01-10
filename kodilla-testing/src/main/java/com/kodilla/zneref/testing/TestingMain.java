package com.kodilla.zneref.testing;

import com.kodilla.zneref.testing.calculator.Calculator;
import com.kodilla.zneref.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        // forum user test
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("Forum user test ok.");
        } else {
            System.out.println("Forum test failed.");
        }

        // calculator test
        int a = 10, b = 20;
        Calculator calculator = new Calculator();
        if (((a + b) == calculator.add(a, b) && (a - b) == calculator.subtract(a, b))) {
            System.out.println("Calculator test ok.");
        } else {System.out.println("Calculator test failed.");}
    }
}