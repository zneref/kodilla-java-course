package com.kodilla.zneref.stream.iterate;


import java.util.stream.Stream;

public final class NumbersGenerator {
    public static void generateEven(int max) {
        Stream.iterate(1, n -> n + 1)
                .limit(max)
                .filter(NumbersGenerator::exterminateOdd)
                .forEach(System.out::println);
    }

    private static boolean exterminateOdd(long n) {
        return (n % 2) == 0;
    }
}