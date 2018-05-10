package com.kodilla.zneref.stream.invoice.simple;

import org.junit.Assert;
import org.junit.Test;

import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class SimpleInvoiceTestSuite {
    @Test
    public void testGetValueToPay() {
        //Given
        Random random = new Random();
        SimpleInvoice invoice = new SimpleInvoice();
        SimpleProduct p1 = new SimpleProduct("Product 1", 17.28);
        SimpleProduct p2 = new SimpleProduct("Product 2", 11.99);
        SimpleProduct p3 = new SimpleProduct("Product 3", 6.49);
        //When
        for (int i = 0; i < 10; i++) {
           String pName = "Product " + random.nextInt(3);
           SimpleProduct p = new SimpleProduct(pName, 3.0);
            invoice.addItem(new SimpleItem(p, 2.0));
        }
        //Then
        Assert.assertEquals(60.0, invoice.getValueToPay(), 0.001);
    }
}