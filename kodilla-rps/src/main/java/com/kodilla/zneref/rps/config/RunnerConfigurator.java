package com.kodilla.zneref.rps.config;

public class RunnerConfigurator {
    private final int gameMode;
    private final int numOfRounds;
    private final String userName;

    private RunnerConfigurator(Config config) {
        gameMode = config.gameMode;
        numOfRounds = config.numOfRounds;
        userName = config.userName;
    }

    public int getGameMode() {
        return gameMode;
    }

    public int getNumOfRounds() {
        return numOfRounds;
    }

    public String getUserName() {
        return userName;
    }

    public static class Config {
        private final int gameMode;
        private final int numOfRounds;
        private String userName;

        public Config(int gameMode, int numOfRounds) {
            this.gameMode = gameMode;
            this.numOfRounds = numOfRounds;
        }

        public Config userName(String name) {
            userName = name;
            return this;
        }

        public RunnerConfigurator build() {
            return new RunnerConfigurator(this);
        }
    }
}
