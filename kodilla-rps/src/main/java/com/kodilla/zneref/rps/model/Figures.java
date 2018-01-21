package com.kodilla.zneref.rps.model;

import java.util.Arrays;
import java.util.List;

public final class Figures {
    private static final Figures INSTANCE = new Figures();
    private final List<Figure> figureList;

    private Figures() {
        figureList = Arrays.asList(
                new Figure(FiguresNames.ROCK, Arrays.asList(FiguresNames.SCISSORS, FiguresNames.LIZARD)),
                new Figure(FiguresNames.PAPER, Arrays.asList(FiguresNames.ROCK, FiguresNames.SPOCK)),
                new Figure(FiguresNames.SCISSORS, Arrays.asList(FiguresNames.PAPER, FiguresNames.LIZARD)),
                new Figure(FiguresNames.LIZARD, Arrays.asList(FiguresNames.PAPER, FiguresNames.SPOCK)),
                new Figure(FiguresNames.SPOCK, Arrays.asList(FiguresNames.SCISSORS, FiguresNames.ROCK)));
    }

    public static Figures getInstance() {
        return INSTANCE;
    }

    public List<Figure> getFigureList() {
        return figureList;
    }
}
