package com.kodilla.zneref.patterns2.adapter.bookclasifier.libraryb;

import com.kodilla.zneref.patterns2.adapter.bookclasifier.model.Book;

import java.util.Map;

public interface BookStatistics {
    int averagePublicationYear(Map<BookSignature, Book> books);

    int medianPublicationYear(Map<BookSignature, Book> books);
}
