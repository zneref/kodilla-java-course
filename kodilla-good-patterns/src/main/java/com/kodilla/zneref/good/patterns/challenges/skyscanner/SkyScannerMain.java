package com.kodilla.zneref.good.patterns.challenges.skyscanner;

import com.kodilla.zneref.good.patterns.challenges.skyscanner.domain.Flight;
import com.kodilla.zneref.good.patterns.challenges.skyscanner.domain.Query;
import com.kodilla.zneref.good.patterns.challenges.skyscanner.services.QueryProcessor;
import com.kodilla.zneref.good.patterns.challenges.skyscanner.services.QueryRetriever;
import com.kodilla.zneref.good.patterns.challenges.skyscanner.services.provider.ScheduleProvider;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class SkyScannerMain {
    public static void main(String[] args) {
        QueryRetriever queryRetriever = new QueryRetriever();
        List<Query> queries = queryRetriever.retrieve();
        ScheduleProvider scheduleProvider = ScheduleProvider.getInstance();
        QueryProcessor queryProcessor = new QueryProcessor(scheduleProvider);
        for (Query query : queries) {
            System.out.println(query);
            System.out.println("------------------------------------------------------------------------");
            List<Map<Flight, List<LocalDateTime>>> flights = queryProcessor.process(query);
            for (Map<Flight, List<LocalDateTime>> m : flights) {
                for (Map.Entry e : m.entrySet()) System.out.println(e);
            }
            System.out.println("------------------------------------------------------------------------");
        }
    }
}
