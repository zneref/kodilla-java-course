package com.kodilla.zneref.rps;

import com.kodilla.zneref.rps.model.FiguresNames;
import com.kodilla.zneref.rps.config.GameModes;
import com.kodilla.zneref.rps.config.RunnerConfigurator;
import com.kodilla.zneref.rps.utils.InputReader;

public class RpsMain {
    public static void main(String[] args) {
        welcome();
        int mode = mode();
        int rounds = rounds();
        String user = user();
        keysInfo(mode);
        RunnerConfigurator configurator =
                new RunnerConfigurator.Config(mode, rounds).userName(user).build();
        GameRunner runner = new GameRunner(configurator);
        runner.run();
        bye();
    }

    private static int mode() {
        System.out.println("game mode".toUpperCase());
        System.out.println("(1) - simple mode, play with: rock, paper and scissors");
        System.out.println("(2) - extended mode, play with: rock, paper, scissors, lizard and spock");
        return InputReader.nextIntInRange(1, 2);
    }

    private static int rounds() {
        System.out.println("number of rounds".toUpperCase());
        return InputReader.nextIntInRange(1, 10);
    }

    private static String user() {
        System.out.println("user name".toUpperCase());
        return InputReader.next("Enter your name (letters only):", "[a-zA-Z]+");
    }

    private static void keysInfo(int mode) {
        System.out.println();
        System.out.println("keys info".toUpperCase());
        System.out.println("Key 1 to play with " + FiguresNames.ROCK.toUpperCase() + ".");
        System.out.println("Key 2 to play with " + FiguresNames.PAPER.toUpperCase() + ".");
        System.out.println("Key 3 to play with " + FiguresNames.SCISSORS.toUpperCase() + ".");
        if (mode == GameModes.EXTENDED) {
            System.out.println("Key 4 to play with " + FiguresNames.LIZARD.toUpperCase() + ".");
            System.out.println("Key 5 to play with " + FiguresNames.SPOCK.toUpperCase() + ".");
        }
        System.out.println();
    }

    private static void welcome() {
        System.out.println("\n******Welcome to the \"Rock, Paper and Scissors\" game******\n");
    }

    private static void bye() {
        System.out.println("Bye :-)");
    }
}
