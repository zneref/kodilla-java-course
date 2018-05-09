package com.kodilla.zneref.stream.invoice.simple;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleInvoiceTestSuite {
    @Test
    public void testGetValueToPay() {
        //Given
        SimpleInvoice invoice = new SimpleInvoice();
        SimpleProduct p1 = new SimpleProduct("Product 1", 17.28);
        SimpleProduct p2 = new SimpleProduct("Product 2", 11.99);
        SimpleProduct p3 = new SimpleProduct("Product 3",  6.49);
        //When
        invoice.addItem(new SimpleItem(p1, 2.0));
        invoice.addItem(new SimpleItem(p2, 3.5));
        invoice.addItem(new SimpleItem(p3, 5.0));
        //Then
        Assert.assertEquals(108.975, invoice.getValueToPay(), 0.001);
    }
}