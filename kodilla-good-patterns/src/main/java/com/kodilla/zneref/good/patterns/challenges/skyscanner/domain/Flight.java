package com.kodilla.zneref.good.patterns.challenges.skyscanner.domain;

import java.time.Duration;
import java.util.Objects;

public final class Flight {
    private final long id;
    private final Airport from;
    private final Airport to;
    private final Duration duration;

    public Flight(long id, Airport from, Airport to, Duration duration) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.duration = duration;
    }

    public Airport getFrom() {
        return from;
    }

    public Airport getTo() {
        return to;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, from, to, duration);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return id == flight.id &&
                Objects.equals(from, flight.from) &&
                Objects.equals(to, flight.to) &&
                Objects.equals(duration, flight.duration);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", from=" + from.getCity() +
                ", to=" + to.getCity() +
                ", duration=" + duration +
                '}';
    }
}
