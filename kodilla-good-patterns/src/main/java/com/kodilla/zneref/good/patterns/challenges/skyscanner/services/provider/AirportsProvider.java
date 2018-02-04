package com.kodilla.zneref.good.patterns.challenges.skyscanner.services.provider;

import com.kodilla.zneref.good.patterns.challenges.skyscanner.domain.Airport;

import java.util.Arrays;
import java.util.List;

public final class AirportsProvider {
    private static final AirportsProvider AIRPORTS_PROVIDER = new AirportsProvider();
    private final List<Airport> airports;

    private AirportsProvider() {
        airports = Arrays.asList(
                new Airport("WAW", "Okęcie", "Warszawa"),
                new Airport("KRK", "Balice", "Kraków"),
                new Airport("GDN", "Rębiechowo", "Gdańsk"),
                new Airport("KTW", "Pyrzowice", "Katowice"),
                new Airport("WRO", "Strachowice", "Wrocław"),
                new Airport("POZ", "Ławica", "Poznań"),
                new Airport("RZE", "Jesionka", "Rzeszów"),
                new Airport("LCJ", "Lublinek", "Łódź"),
                new Airport("SZZ", "Goleniów", "Szczecin"),
                new Airport("RDO", "Sadków", "Radom"));
    }

    public static AirportsProvider getInstance() { return AIRPORTS_PROVIDER; }

    public List<Airport> getAirports() {
        return airports;
    }
}
