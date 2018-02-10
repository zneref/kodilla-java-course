package com.kodilla.zneref.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void add() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.zneref.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.add(2, 2);
        //Then
        Assert.assertEquals(4, result, 0.1);
    }

    @Test
    public void sub() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.zneref.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.sub(2, 2);
        //Then
        Assert.assertEquals(0, result, 0.1);
    }

    @Test
    public void mul() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.zneref.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.mul(2, 2);
        //Then
        Assert.assertEquals(4, result, 0.1);
    }

    @Test
    public void div() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.zneref.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.div(2, 2);
        //Then
        Assert.assertEquals(1, result, 0.1);
    }
}