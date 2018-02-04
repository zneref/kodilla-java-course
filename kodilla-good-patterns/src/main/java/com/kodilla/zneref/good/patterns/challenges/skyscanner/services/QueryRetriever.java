package com.kodilla.zneref.good.patterns.challenges.skyscanner.services;

import com.kodilla.zneref.good.patterns.challenges.skyscanner.domain.Query;

import java.util.Arrays;
import java.util.List;

public class QueryRetriever {
    public static final String VALUE_NOT_SET = "value not set";
    private final List<Query> queries;

    public QueryRetriever() {
        queries = Arrays.asList(new Query("Kraków", "Poznań", "Warszawa"),
                new Query("Kraków", "Warszawa", VALUE_NOT_SET),
                new Query("Warszawa", "Poznań", VALUE_NOT_SET),
                new Query("Kraków", VALUE_NOT_SET, VALUE_NOT_SET),
                new Query("Warszawa", VALUE_NOT_SET, VALUE_NOT_SET),
                new Query(VALUE_NOT_SET, "Warszawa", VALUE_NOT_SET),
                new Query(VALUE_NOT_SET, "Poznań", VALUE_NOT_SET),
                new Query(VALUE_NOT_SET, VALUE_NOT_SET, "Warszawa"));
    }

    public List<Query> retrieve() { return queries; }
}


