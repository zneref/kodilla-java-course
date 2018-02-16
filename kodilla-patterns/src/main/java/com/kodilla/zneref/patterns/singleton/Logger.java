package com.kodilla.zneref.patterns.singleton;

public final class Logger {
    private static volatile Logger theOnlyOneLoggerInstance = null;
    private String lastLog = "";

    private Logger() {}

    public static Logger getInstance() {
        if (theOnlyOneLoggerInstance == null) {
            synchronized (Logger.class) {
                if (theOnlyOneLoggerInstance == null)
                    theOnlyOneLoggerInstance = new Logger();
            }
        }
        return theOnlyOneLoggerInstance;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}
