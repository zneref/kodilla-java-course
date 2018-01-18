package com.kodilla.zneref.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Continent europe = new Continent("Europe", Arrays.asList(
                new Country("FR", new BigDecimal("66318000")),
                new Country("ES", new BigDecimal("46464000")),
                new Country("DE", new BigDecimal("81084000")),
                new Country("NO", new BigDecimal("5166000")),
                new Country("IT", new BigDecimal("60788000")),
                new Country("PL", new BigDecimal("38484000"))));

        Continent asia = new Continent("Asia", Arrays.asList(
                new Country("RU", new BigDecimal("143976000")),
                new Country("CN", new BigDecimal("1360720000")),
                new Country("IN", new BigDecimal("1236345000")),
                new Country("KZ", new BigDecimal("17949000"))));

        Continent africa = new Continent("Africa", Arrays.asList(
                new Country("DZ", new BigDecimal("38700000")),
                new Country("LY", new BigDecimal("6310000")),
                new Country("EG", new BigDecimal("82537000")),
                new Country("CD", new BigDecimal("71713000"))));

        World earth = new World(Arrays.asList(europe, asia, africa));

        //When
        BigDecimal allOfThePeople = earth.getPeopleQuantity();

        //Then
        BigDecimal expectedValue = new BigDecimal("3256554000");
        Assert.assertEquals(expectedValue, allOfThePeople);
    }
}