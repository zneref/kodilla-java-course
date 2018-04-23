package com.kodilla.zneref.patterns2.decorator.taxiportal;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class BasicTaxiOrderTestSuite {

    @Test
    public void testTaxiBasicGetCost(){
        //Given, When
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        //Then
        assertEquals(new BigDecimal(5.00), taxiOrder.getCost());
    }

    @Test
    public void testTaxiBasicGetDescription() {
        //Given, When
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        //Then
        assertEquals("Drive a course", taxiOrder.getDescription());
    }

    @Test
    public void testTaxiNetworkGetCost() {
        //Given
        TaxiOrder order = new BasicTaxiOrder();
        //When
        order = new TaxiNetworkOrderDecorator(order);
        //Then
        assertEquals(new BigDecimal(40), order.getCost());
    }
    @Test
    public void testTaxiNetworkGetDescription() {
        //Given
        TaxiOrder order = new BasicTaxiOrder();
        //When
        order = new TaxiNetworkOrderDecorator(order);
        //Then
        assertEquals("Drive a course by Taxi Network", order.getDescription());
    }

    @Test
    public void testMyTaxiWithChildSeatGetDescription() {
        //Given
        TaxiOrder order = new BasicTaxiOrder();
        order = new TaxiNetworkOrderDecorator(order);
        order = new ChildSeatDecorator(order);
        order = new ChildSeatDecorator(order);
        //When
        String desc = order.getDescription();
        //Then
        assertEquals("Drive a course by Taxi Network + child seat + child seat", desc);
    }
}