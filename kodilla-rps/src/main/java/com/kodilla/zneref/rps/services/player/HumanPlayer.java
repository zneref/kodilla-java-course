package com.kodilla.zneref.rps.services.player;

import com.kodilla.zneref.rps.model.Figure;
import com.kodilla.zneref.rps.config.GameModes;
import com.kodilla.zneref.rps.utils.InputReader;

import java.util.List;

public class HumanPlayer implements Player {
    private final List<Figure> figures;

    public HumanPlayer(List<Figure> figures) {
        this.figures = figures;
    }

    @Override
    public Figure play(int mode) {
        int number;
        switch (mode) {
            case GameModes.SIMPLE:
                number = InputReader.nextIntInRange(1, 3);
                break;
            case GameModes.EXTENDED:
            default:
                number = InputReader.nextIntInRange(1, 5);
        }
        return figures.get(number - 1);
    }
}
