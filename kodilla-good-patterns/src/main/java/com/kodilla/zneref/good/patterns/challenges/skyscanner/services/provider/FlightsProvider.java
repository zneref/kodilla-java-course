package com.kodilla.zneref.good.patterns.challenges.skyscanner.services.provider;

import com.kodilla.zneref.good.patterns.challenges.skyscanner.domain.Airport;
import com.kodilla.zneref.good.patterns.challenges.skyscanner.domain.Flight;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.kodilla.zneref.good.patterns.challenges.skyscanner.util.RandomInts.nextInt;

public final class FlightsProvider {
    private static final FlightsProvider FLIGHTS_PROVIDER = new FlightsProvider();
    private final Set<Flight> flights;

    private FlightsProvider() {
        List<Airport> airports = AirportsProvider.getInstance().getAirports();
        flights = new HashSet<>();
        for (int i = 0; i < 200; i++) {
            Airport from, to;
            while (true) {
                from = airports.get(nextInt(0, airports.size()));
                to = airports.get((nextInt(0, airports.size())));
                if (from != to)
                    break;
            }
            Duration duration = Duration.ofMinutes(nextInt(50, 200));
            flights.add(new Flight(i, from, to, duration));
        }
    }

    public static FlightsProvider getInstance() {
        return FLIGHTS_PROVIDER;
    }

    public Set<Flight> getFlights() {
        return flights;
    }
}
