package com.kodilla.zneref.rps.model;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FigureTestSuite {

    @Test
    public void testCompareTo() {
        //Given
        Figure rock = new Figure(FiguresNames.ROCK, Arrays.asList(FiguresNames.SCISSORS));
        Figure paper = new Figure(FiguresNames.PAPER, Arrays.asList(FiguresNames.ROCK));
        Figure scissors = new Figure(FiguresNames.SCISSORS,Arrays.asList(FiguresNames.PAPER));
        // When
        int equal =  rock.compareTo(rock);
        int weaker = rock.compareTo(paper);
        int stronger = rock.compareTo(scissors);

        assertEquals(0,equal);
        assertEquals(-1,weaker);
        assertEquals(1,stronger);
    }
}