package com.kodilla.zneref.sudoku.service;

public class SudokuBoardValidator implements BoardValidator {
    public boolean validate(int i, int j, int val, int[][] matrix) {
        for (int k = 0; k < 9; ++k)
            if (val == matrix[k][j])
                return false;

        for (int k = 0; k < 9; ++k)
            if (val == matrix[i][k])
                return false;

        int boxRowOffset = (i / 3) * 3;
        int boxColOffset = (j / 3) * 3;
        for (int k = 0; k < 3; ++k)
            for (int m = 0; m < 3; ++m)
                if (val == matrix[boxRowOffset + k][boxColOffset + m])
                    return false;

        return true;
    }
}
