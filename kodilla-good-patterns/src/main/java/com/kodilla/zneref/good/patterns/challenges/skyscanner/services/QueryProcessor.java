package com.kodilla.zneref.good.patterns.challenges.skyscanner.services;

import com.kodilla.zneref.good.patterns.challenges.skyscanner.domain.Flight;
import com.kodilla.zneref.good.patterns.challenges.skyscanner.domain.Query;
import com.kodilla.zneref.good.patterns.challenges.skyscanner.services.provider.ScheduleProvider;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class QueryProcessor {
    private ScheduleProvider provider;

    public QueryProcessor(ScheduleProvider provider) {
        this.provider = provider;
    }

    public List<Map<Flight, List<LocalDateTime>>> process(Query query) {
        List<Map<Flight, List<LocalDateTime>>> queryResult = new ArrayList<>();
        String from = query.getFrom();
        String to = query.getTo();
        String through = query.getThrough();

        if (hasValue(through)) {
            queryResult.add(getFlights(from, through));
            queryResult.add(getFlights(through, to));
        } else
            queryResult.add(getFlights(from, to));

        return queryResult;
    }

    private Map<Flight, List<LocalDateTime>> getFlights(String from, String to) {
        List<Predicate<Map.Entry<Flight, List<LocalDateTime>>>> flightPredicates = new ArrayList<>();

        if (hasValue(from))
            flightPredicates.add(map -> map.getKey().getFrom().getCity().equals(from));
        if (hasValue(to))
            flightPredicates.add(map -> map.getKey().getTo().getCity().equals(to));

        Predicate<Map.Entry<Flight, List<LocalDateTime>>> reduced = flightPredicates.stream()
                .reduce(x -> true, Predicate::and);

        return provider.getSchedule().entrySet().stream()
                .filter(reduced)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    private boolean hasValue(String field) {
        return !field.equals(QueryRetriever.VALUE_NOT_SET);
    }
}
