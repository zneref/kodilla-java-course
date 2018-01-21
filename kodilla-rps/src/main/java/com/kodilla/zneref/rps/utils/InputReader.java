package com.kodilla.zneref.rps.utils;

import java.util.Scanner;

public class InputReader {

    public static int nextIntInRange(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter number in [" + min + "," + max + "] range:");
            while (!sc.hasNextInt()) {
                System.out.println("Please, enter number in [" + min + "," + max + "] range:");
                sc.next();
            }
            number = sc.nextInt();
        } while (number < min || number > max);

        return number;
    }

    public static String next(String msg, String pattern) {
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        while (!sc.hasNext(pattern)) {
            System.out.println(msg);
            sc.next();
        }
        return sc.next();
    }
}
