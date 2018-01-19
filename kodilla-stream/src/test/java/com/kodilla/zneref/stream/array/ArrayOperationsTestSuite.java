package com.kodilla.zneref.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void getAverage() {
        //Given
        int[] num = {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        //When
        double resAv = ArrayOperations.getAverage(num);
        //Then
        double expAv = 3;
        Assert.assertEquals(expAv, resAv,0);
    }
}