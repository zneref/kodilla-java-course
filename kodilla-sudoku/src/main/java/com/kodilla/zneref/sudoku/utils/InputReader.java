package com.kodilla.zneref.sudoku.utils;

import java.util.Scanner;

public class InputReader {

    public static int nextIntInRange(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.printf("Enter number in [%d,%d] range or \'0\' to resolve sudoku:%n", min, max);
            while (!sc.hasNextInt()) {
                System.out.printf("Please, enter number in [%d, %d] range or \'0\' digit:%n", min, max);
                sc.next();
            }
            number = sc.nextInt();
            if(number == 0)
                break;
        } while (number < min || number > max);

        return number;
    }
}
