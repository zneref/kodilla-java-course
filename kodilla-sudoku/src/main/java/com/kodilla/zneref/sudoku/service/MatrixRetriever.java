package com.kodilla.zneref.sudoku.service;

import com.kodilla.zneref.sudoku.utils.InputReader;

public class MatrixRetriever {
    public int[][] retrieveFromInput(BoardValidator validator) {
        int matrix[][] = new int[9][9];
        System.out.println("Please, enter sudoku cell coordinates and number for that cell (eg. 123).");
        int input = -1;
        while (input != 0) {
            input = InputReader.nextIntInRange(111, 999);
            if (input != 0) {
                int n = input;
                int a[] = new int[3];
                int cnt = 0;
                while (n > 0) {
                    int digit = n % 10;
                    n /= 10;
                    a[cnt++] = digit;
                }
                int i = a[2] - 1;
                int j = a[1] - 1;
                int value = a[0];
                if (validator.validate(i, j, value, matrix))
                    matrix[i][j] = value;
                else {
                    System.out.println("The " + value + " digit already exists in this row/column/section.");
                }
            }
        }
        return matrix;
    }
}
