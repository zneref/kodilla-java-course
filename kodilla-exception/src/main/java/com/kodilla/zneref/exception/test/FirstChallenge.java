package com.kodilla.zneref.exception.test;

public class FirstChallenge {

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();
        double result = Double.NaN;
        try {
            result = firstChallenge.divide(3, 0);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero " + e + " caught.");
        } finally {
            System.out.println("Result=" + result);
        }
    }

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}
