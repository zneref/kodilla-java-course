package com.kodilla.zneref.good.patterns.challenges.skyscanner.domain;

import java.util.Objects;

public final class Airport {
    private final String iata;
    private final String name;
    private final String city;

    public Airport(String iata, String name, String city) {
        this.iata = iata;
        this.name = name;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @Override
    public int hashCode() {
        return Objects.hash(iata, name, city);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airport)) return false;
        Airport airport = (Airport) o;
        return Objects.equals(iata, airport.iata) &&
                Objects.equals(name, airport.name) &&
                Objects.equals(city, airport.city);
    }
}
