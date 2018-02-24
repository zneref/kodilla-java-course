package com.kodilla.zneref.sudoku;

import com.kodilla.zneref.sudoku.model.SudokuBoard;
import com.kodilla.zneref.sudoku.service.BoardValidator;
import com.kodilla.zneref.sudoku.service.MatrixRetriever;
import com.kodilla.zneref.sudoku.service.SudokuBoardValidator;
import com.kodilla.zneref.sudoku.service.SudokuResolver;

public class SudokuGame {
    public static void main(String[] args) throws InterruptedException {
        sayWelcome();
        MatrixRetriever retriever = new MatrixRetriever();
        BoardValidator validator = new SudokuBoardValidator();
        SudokuBoard board = new SudokuBoard(retriever.retrieveFromInput(validator));
        System.out.println("\nUnsolved sudoku:");
        System.out.println(board);
        SudokuResolver resolver = new SudokuResolver(validator);
        System.out.print("Solving sudoku, please wait...");
        int counter = 0;
        StringBuilder builder = new StringBuilder();
        while (counter < 5) {
            System.out.print(builder.toString());
            builder.append(".");
            Thread.sleep(1000);
            counter++;
        }
        if (resolver.resolveSudoku(board)) {
            System.out.println("\n\nSolved sudoku:");
            System.out.println(board);
        } else System.out.println("Can't resolve sudoku.");
        sayBye();
    }

    private static void sayWelcome() {
        System.out.println("\n****************Welcome to the \"Sudoku\" game****************\n");
    }

    private static void sayBye() {
        System.out.println("Bye :-)");
    }
}
