package com.kodilla.zneref.patterns2.adapter.bookclasifier.libraryb;

import com.kodilla.zneref.patterns2.adapter.bookclasifier.model.Book;

import java.util.Arrays;
import java.util.Map;

public class Statistics implements BookStatistics {
    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        if (books.size() == 0) return 0;
        int sum = 0;
        for (Map.Entry<BookSignature, Book> entry : books.entrySet()) {
            sum += entry.getValue().getPublicationYear();
        }
        return sum / books.size();
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        if (books.size() == 0) return 0;
        int[] years = new int[books.size()];
        int n = 0;
        for (Map.Entry<BookSignature, Book> entry : books.entrySet()) {
            years[n] = entry.getValue().getPublicationYear();
            n++;
        }
        Arrays.sort(years);
        if (years.length % 2 == 0) {
            return years[(int) (years.length / 2 + 0.5)];
        } else {
            return years[years.length / 2];
        }
    }
}
