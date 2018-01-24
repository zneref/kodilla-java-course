package com.kodilla.zneref.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        ExceptionHandling h = new ExceptionHandling();
        h.handleAndProcessAnException();
    }

    public void handleAndProcessAnException() {
        SecondChallenge challenge = new SecondChallenge();
        try {
            System.out.println("Try risky method...");
            System.out.println(challenge.probablyIWillThrowException(1.5, 3));
        } catch (Exception e) {
            System.out.println("An exception caught!");
        } finally {
            System.out.println("Finally block - always processed.");
        }
    }
}
