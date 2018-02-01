package com.kodilla.zneref.good.patterns.challenges.moviestore;

import com.kodilla.zneref.good.patterns.challenges.moviestore.domain.MovieStore;

import java.util.stream.Collectors;

public class MovieStoreMain {
    public static void main(String[] args) {
        MovieStore store = new MovieStore();
        String titles = store.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining("#!%@"));
        System.out.println(titles);
    }
}
