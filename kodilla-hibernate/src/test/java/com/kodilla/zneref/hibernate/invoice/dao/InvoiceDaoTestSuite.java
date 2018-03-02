package com.kodilla.zneref.hibernate.invoice.dao;

import com.kodilla.zneref.hibernate.invoice.Invoice;
import com.kodilla.zneref.hibernate.invoice.Item;
import com.kodilla.zneref.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Product product = new Product("ogórki kiszone małosolne");
        Product product2 = new Product("Żołądkowa gorzka");
        Item item1 = new Item(product, new BigDecimal(4.99), 2);
        Item item2 = new Item(product, new BigDecimal(4.99), 3);
        Item item3 = new Item(product2, new BigDecimal(25.50), 1);
        Invoice invoice = new Invoice("2018/01/01");
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice((invoice));
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(invoice);

        //Then
        int id = invoice.getId();
        Assert.assertNotEquals(0, id);

        //Cleanup
        invoiceDao.delete(id);
    }

}