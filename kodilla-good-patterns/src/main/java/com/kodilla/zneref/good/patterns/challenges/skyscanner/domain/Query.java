package com.kodilla.zneref.good.patterns.challenges.skyscanner.domain;

public final class Query {
    private final String from;
    private final String to;
    private final String through;

    public Query(String from, String to, String through) {
        this.from = from;
        this.to = to;
        this.through = through;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getThrough() {
        return through;
    }

    @Override
    public String toString() {
        return "Query{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", through='" + through + '\'' +
                '}';
    }
}
