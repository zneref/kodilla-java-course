package com.kodilla.zneref.good.patterns.challenges.skyscanner.services.provider;

import com.kodilla.zneref.good.patterns.challenges.skyscanner.domain.Flight;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;

import static com.kodilla.zneref.good.patterns.challenges.skyscanner.util.RandomInts.nextInt;

public final class ScheduleProvider {
    private static final ScheduleProvider SCHEDULE_PROVIDER = new ScheduleProvider();
    private final Map<Flight, List<LocalDateTime>> schedule;

    private ScheduleProvider() {
        Set<Flight> flights = FlightsProvider.getInstance().getFlights();
        schedule = new HashMap<>();
        for (Flight flight : flights) {
            schedule.put(flight, generateDepartures(2018, Month.MARCH, nextInt(0, 24), nextInt(0, 60)));
        }
    }

    public static ScheduleProvider getInstance() {
        return SCHEDULE_PROVIDER;
    }

    public Map<Flight, List<LocalDateTime>> getSchedule() {
        return new HashMap<>(schedule);
    }

    private List<LocalDateTime> generateDepartures(int year, Month month, int hour, int minute) {
        List<LocalDateTime> departures = new ArrayList<>();
        for (int i = 1; i <= month.length(false); i++) {
            departures.add(LocalDateTime.of(year, month, i, hour, minute));
        }
        return departures;
    }
}
