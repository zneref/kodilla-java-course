package com.kodilla.zneref.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacBuilder() {

        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .burgers(3)
                .roll("sezam")
                .sauce("standard")
                .ingrient("chili")
                .ingrient("onion")
                .build();

        System.out.println(bigmac);

        //When
        int ingrients = bigmac.getIngrients().size();

        //Then
        Assert.assertEquals(2, ingrients);
        Assert.assertEquals("sezam", bigmac.getRoll());
    }
}