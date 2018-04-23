package com.kodilla.zneref.patterns2.adapter.bookclasifier;

import com.kodilla.zneref.patterns2.adapter.bookclasifier.model.Book;
import com.kodilla.zneref.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.zneref.patterns2.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodilla.zneref.patterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    private final Statistics statistics;

    public MedianAdaptee() {
        this.statistics = new Statistics();
    }

    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        return statistics.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        return statistics.medianPublicationYear(books);
    }
}
