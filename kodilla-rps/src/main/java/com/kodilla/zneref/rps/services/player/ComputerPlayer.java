package com.kodilla.zneref.rps.services.player;

import com.kodilla.zneref.rps.model.Figure;
import com.kodilla.zneref.rps.config.GameModes;
import com.kodilla.zneref.rps.utils.RandomInts;

import java.util.List;

public class ComputerPlayer implements Player {
    private final List<Figure> figures;

    public ComputerPlayer(List<Figure> figures) {
        this.figures = figures;
    }

    @Override
    public Figure play(int mode) {
        switch (mode) {
            case GameModes.SIMPLE:
                return figures.get(RandomInts.nextInt(0, 2));
            case GameModes.EXTENDED:
            default:
                return figures.get(RandomInts.nextInt(0, 4));
        }
    }
}
