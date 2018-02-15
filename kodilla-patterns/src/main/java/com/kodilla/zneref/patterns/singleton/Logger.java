package com.kodilla.zneref.patterns.singleton;

public final class Logger {
    private static Logger theOnlyOneLoggerInstance = null;
    private String lastLog = "";

    private Logger() {}

    public static synchronized Logger getInstance() {
        if (theOnlyOneLoggerInstance == null) {
            theOnlyOneLoggerInstance = new Logger();
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
