package com.kodilla.zneref.sudoku.service;

import com.kodilla.zneref.sudoku.model.SudokuBoard;

public class SudokuResolver {
    private BoardValidator validator;

    public SudokuResolver(BoardValidator validator) {
        this.validator = validator;
    }

    public boolean resolveSudoku(SudokuBoard board) {
        return resolve(0, 0, board.getMatrix());
    }

    private boolean resolve(int i, int j, int[][] matrix) {
        if (i == 9) {
            i = 0;
            if (++j == 9)
                return true;
        }
        if (matrix[i][j] != 0)
            return resolve(i + 1, j, matrix);

        for (int value = 1; value <= 9; ++value) {
            if (validator.validate(i, j, value, matrix)) {
                matrix[i][j] = value;
                if (resolve(i + 1, j, matrix))
                    return true;
            }
        }
        matrix[i][j] = 0;
        return false;
    }
}
