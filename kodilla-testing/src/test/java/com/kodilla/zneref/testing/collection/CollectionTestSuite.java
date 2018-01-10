package com.kodilla.zneref.testing.collection;

import com.kodilla.zneref.utils.RandomInts;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;
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
        // given
        List<Integer> testList = new ArrayList<>();
        OddNumbersExterminator ext = new OddNumbersExterminator();
        // when
        List<Integer> result = ext.exterminate(testList);
        // then
        Assert.assertEquals(result.size(), testList.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        // given
        List<Integer> testList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            testList.add(RandomInts.nextInt(1, 100));
        }
        List<Integer> evenList = testList
                .stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        OddNumbersExterminator ext = new OddNumbersExterminator();
        // when
        List<Integer> result = ext.exterminate(testList);
        // then
        Assert.assertEquals(evenList.size(), result.size());
    }
}
