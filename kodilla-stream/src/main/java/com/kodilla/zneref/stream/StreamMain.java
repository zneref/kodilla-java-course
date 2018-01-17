package com.kodilla.zneref.stream;

import com.kodilla.zneref.stream.beautifier.PoemBeautifier;
import com.kodilla.zneref.stream.beautifier.PoemBeautifierWithNativeJava;
import com.kodilla.zneref.stream.lambda.ExpressionExecWithNativeJava;
import com.kodilla.zneref.stream.lambda.ExpressionExecutor;
import com.kodilla.zneref.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("Calculating expressions with native java functional interfaces");

        ExpressionExecWithNativeJava exec = new ExpressionExecWithNativeJava();

        exec.executeExpression(10, 5, (a, b) -> a + b);
        exec.executeExpression(10, 5, (a, b) -> a - b);
        exec.executeExpression(10, 5, (a, b) -> a * b);
        exec.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Exercise 7.1 - poem beautifier");

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        final String poem = "Wlazl kotek na plotek i mruga";

        poemBeautifier.beautify(poem, s -> "AAA" + s + "AAA");
        poemBeautifier.beautify(poem, s -> s.toUpperCase());
        poemBeautifier.beautify(poem, s -> s.replace('a', '@'));
        poemBeautifier.beautify(poem, s -> s.substring(4).replaceAll("[koa]", "^^"));

        System.out.println("Exercise 7.1 - poem beautifier with native java functional interfaces");

        PoemBeautifierWithNativeJava beautifier = new PoemBeautifierWithNativeJava();
        beautifier.beautify(poem, s -> "ABC" + s + "DEF");
        beautifier.beautify(poem, String::toUpperCase);
        beautifier.beautify(poem, s -> s.replace('a', 'p'));
        beautifier.beautify(poem, s -> s.substring(4).replaceAll("[koa]", "##"));
    }
}