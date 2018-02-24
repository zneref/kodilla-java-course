package com.kodilla.zneref.sudoku.service;

public interface BoardValidator {
    boolean validate(int i, int j, int val, int[][] matrix);
}
