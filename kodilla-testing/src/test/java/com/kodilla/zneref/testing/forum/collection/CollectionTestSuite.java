package com.kodilla.zneref.testing.forum.collection;

import com.kodilla.zneref.testing.collection.OddNumbersExterminator;
import com.kodilla.zneref.utils.RandomInts;
import org.junit.*;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class CollectionTestSuite {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite for collection: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite for collection: end");
    }

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        ArrayList<Integer> testList = new ArrayList<>();
        OddNumbersExterminator ext = new OddNumbersExterminator();
        ArrayList<Integer> result = ext.exterminate(testList);
        Assert.assertEquals(result.size(), testList.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        ArrayList<Integer> testList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            testList.add(RandomInts.nextInt(1, 100));
        }
        ArrayList<Integer> evenList = testList
                .stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        OddNumbersExterminator ext = new OddNumbersExterminator();
        ArrayList<Integer> result = ext.exterminate(testList);
        Assert.assertEquals(evenList.size(),result.size());
    }
}
