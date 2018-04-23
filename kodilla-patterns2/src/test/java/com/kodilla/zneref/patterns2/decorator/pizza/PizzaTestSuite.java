package com.kodilla.zneref.patterns2.decorator.pizza;

import org.junit.Test;

import static org.junit.Assert.*;

public class PizzaTestSuite {
    private final int SIZE_SMALL = 10;
    private final int SIZE_MEDIUM = 20;
    private final int SIZE_BIG = 30;

    @Test
    public void testPizzaVegetarianaCost() {
        //Given
        Pizza pizza = new BasicPizza(SIZE_SMALL);
        pizza = new PizzaVegetariana(pizza);

        //When
        float cost = pizza.cost();

        //Then
        assertEquals(14.98, cost, 0.001);
    }

    @Test
    public void testPizzaVegetarianaWithDiabloSauceDescription() {
        //Given
        Pizza pizza = new BasicPizza(SIZE_BIG);
        pizza = new PizzaVegetariana(pizza);
        pizza = new PizzaDiabloSauce(pizza);

        //When
        String dsc = pizza.description();

        //Then
        assertEquals("Pizza with cheese and olives and hot sauce", dsc);

    }

    @Test
    public void testPizzaVegetarianaWithDiabloSauceCost() {
        //Given
        Pizza pizza = new BasicPizza(SIZE_BIG); // 19.99
        pizza = new PizzaVegetariana(pizza);    // + 4.99
        pizza = new PizzaDiabloSauce(pizza);    // + 1.99
        pizza = new PizzaDiabloSauce(pizza);    // + 1.99

        //When
        float totalCost = pizza.cost();

        //Then
        assertEquals(28.96, totalCost, 0.001);

    }

}