package com.kodilla.zneref.sudoku.model;

public final class SudokuBoard {
    private final int matrix[][];

    public SudokuBoard(int matrix[][]) {
        this.matrix = matrix;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 9; ++i) {
            if (i % 3 == 0)
                builder.append(" -----------------------\n");
            for (int j = 0; j < 9; ++j) {
                if (j % 3 == 0) builder.append("| ");
                builder.append(matrix[i][j] == 0
                        ? " "
                        : Integer.toString(matrix[i][j]));

                builder.append(' ');
            }
            builder.append("|\n");
        }
        builder.append(" -----------------------\n");
        return builder.toString();
    }
}
