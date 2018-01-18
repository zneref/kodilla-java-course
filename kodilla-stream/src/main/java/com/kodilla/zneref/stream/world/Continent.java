package com.kodilla.zneref.stream.world;

import java.util.List;

public final class Continent {
    private final String continent;
    private final List<Country> countries;

    public Continent(String continent, List<Country> countries) {
        this.continent = continent;
        this.countries = countries;
    }

    public String getContinent() {
        return continent;
    }

    public List<Country> getCountries() {
        return countries;
    }
}
