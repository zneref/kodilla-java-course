package com.kodilla.zneref.testing.collection;

import java.util.List;
import java.util.stream.Collectors;

public class  OddNumbersExterminator implements NumbersExterminator {
    @Override
    public List<Integer> exterminate(List<Integer> numbers) {
        return numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    }
}
