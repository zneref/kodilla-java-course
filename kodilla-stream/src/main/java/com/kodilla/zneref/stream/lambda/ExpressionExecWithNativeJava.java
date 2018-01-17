package com.kodilla.zneref.stream.lambda;

import java.util.function.ToDoubleBiFunction;

public class ExpressionExecWithNativeJava {
    public void executeExpression(double a, double b, ToDoubleBiFunction<Double, Double> expression) {
        double result = expression.applyAsDouble(a, b);
        System.out.println("Result equals: " + result);
    }
}
