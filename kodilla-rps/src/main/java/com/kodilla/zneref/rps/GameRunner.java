package com.kodilla.zneref.rps;

import com.kodilla.zneref.rps.model.Figure;
import com.kodilla.zneref.rps.model.Figures;
import com.kodilla.zneref.rps.config.RunnerConfigurator;
import com.kodilla.zneref.rps.services.player.ComputerPlayer;
import com.kodilla.zneref.rps.services.player.HumanPlayer;
import com.kodilla.zneref.rps.services.player.Player;
import com.kodilla.zneref.rps.utils.InputReader;

import java.util.List;

public class GameRunner {
    private int numOfRounds;
    private int mode;
    private String userName;

    public GameRunner(RunnerConfigurator configurator) {
        numOfRounds = configurator.getNumOfRounds();
        mode = configurator.getGameMode();
        userName = configurator.getUserName();
    }

    public void run() {
        List<Figure> figures = Figures.getInstance().getFigureList();
        Player human = new HumanPlayer(figures);
        Player computer = new ComputerPlayer(figures);
        boolean end = false;
        while (!end) {
            int roundsCnt = 1;
            int humanScores = 0;
            int computerScores = 0;

            System.out.println("Game started".toUpperCase());

            while (roundsCnt <= numOfRounds) {
                System.out.println("\nRound ".toUpperCase() + roundsCnt + "/" + numOfRounds);
                Figure humanChoice = human.play(mode);
                Figure computerChoice = computer.play(mode);
                System.out.println(userName + " choice: " + humanChoice.getItemName().toUpperCase());
                System.out.println("Computer choice: " + computerChoice.getItemName().toUpperCase());
                int result = humanChoice.compareTo(computerChoice);
                if (result < 0) computerScores++;
                else if (result > 0) humanScores++;
                System.out.println("Result after " + roundsCnt + " round [" + userName + " vs computer] is "
                        + humanScores + " : " + computerScores);
                roundsCnt++;
            }
            System.out.println("\nThe winner is: " + winner(humanScores, computerScores));
            System.out.println("\nGame ended".toUpperCase());
            String again = InputReader.next("Play again? [y,n]:", "[yn]");
            end = again.charAt(0) == 'n';
        }
    }

    private String winner(int hScores, int cScores) {
        if (hScores > cScores) return  userName;
        if (hScores < cScores) return "computer";
        return "nobody";
    }
}
