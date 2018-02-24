package com.kodilla.zneref.sudoku.service;

import com.kodilla.zneref.sudoku.model.SudokuBoard;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixRetrieverTestSuite {

    @Test
    public void retrieveFromInput() {
        //Given
        MatrixRetriever retriever = new MatrixRetriever();
        int matrix[][] = retriever.retrieveFromInput();
        SudokuBoard board = new SudokuBoard(matrix);
        //When, Then
        System.out.println(board);
    }
}