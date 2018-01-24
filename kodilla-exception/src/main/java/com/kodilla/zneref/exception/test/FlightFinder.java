package com.kodilla.zneref.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public static void main(String[] args) {

        Flight flight = new Flight("Birmingham Airport", "Tenerife South Airport");
        FlightFinder finder = new FlightFinder();

        try {
            finder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Flight not found exception caught.");
        }
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airports = new HashMap<>();

        airports.put("Heathrow Airport", true);
        airports.put("Frankfurt Airport", false);
        airports.put("Palma de Mallorca Airport", true);
        airports.put("Copenhagen Airport", false);
        airports.put("Oslo Airport, Gardermoen", false);
        airports.put("Frederic Chopin Airport", true);

        if (!airports.containsKey(flight.getArrivalAirport()))
            throw new RouteNotFoundException("Route not found exception.");
        System.out.println("Flight to " + flight.getDepartureAirport() + " found.");
    }
}
