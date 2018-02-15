package com.kodilla.zneref.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void getLastLogTest() {
        //given
        Logger logger = Logger.getInstance();
        Logger logger1 = Logger.getInstance();

        //when
        logger.log("dupa wołowa");

        //then
        Assert.assertEquals("dupa wołowa", logger.getLastLog());
        Assert.assertEquals("dupa wołowa", logger1.getLastLog());

    }
}