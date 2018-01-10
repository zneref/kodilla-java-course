package com.kodilla.zneref.testing.collection;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class OddNumbersExterminator implements NumbersExterminator {
    @Override
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        return numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toCollection(ArrayList::new));
    }
}
