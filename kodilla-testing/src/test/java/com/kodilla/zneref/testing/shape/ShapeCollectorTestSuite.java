package com.kodilla.zneref.testing.shape;

import com.kodilla.zneref.testing.shape.model.Circle;
import com.kodilla.zneref.testing.shape.model.Shape;
import com.kodilla.zneref.testing.shape.model.Square;
import com.kodilla.zneref.testing.shape.model.Triangle;
import org.junit.*;

import static org.junit.Assert.*;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;


public class ShapeCollectorTestSuite {
    private static int testCounter;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
        testCounter = 0;
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All " + testCounter + " tests are finished.");
    }

    @Before
    public void setUp() throws Exception {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("End of test #" + testCounter);
    }

    @Test
    public void addFigure() {
        // given
        ShapeCollector collector = new ShapeCollector();
        // when
        collector.addFigure(new Triangle("triangle", 4.4, 7.2));
        // then
        assertEquals(1, collector.getShapesQuantity());
    }

    @Test
    public void removeFigure() {
        // given
        ShapeCollector collector = new ShapeCollector();
        Shape circle = new Circle("circle", 6.7);
        collector.addFigure(circle);
        //when
        boolean result = collector.removeFigure(circle);
        //then
        assertTrue(result);
        assertEquals(0,collector.getShapesQuantity());
    }

    @Test
    public void getFigure() {
        // given
        ShapeCollector collector = new ShapeCollector();
        Shape square = new Square("square", 4.7);
        collector.addFigure(square);
        // when
        Shape result = collector.getFigure(0);
        //then
        assertEquals(result, square);
    }

    @Test
    public void showFigures() {
        //given
        ShapeCollector collector = new ShapeCollector();
        List<Shape> shapes = new ArrayList<>();
        Shape circle = new Circle("circle", 3.3);
        Shape triangle = new Triangle("triangle", 6.3, 5.2);
        // when
        collector.addFigure(circle);
        collector.addFigure(triangle);
        shapes.add(circle);
        shapes.add(triangle);
        // then
        // using assertion from assertj package instead of junit
        assertThat(shapes).containsExactlyElementsOf(collector.getFigures());
    }
}