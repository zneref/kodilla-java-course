package com.kodilla.zneref.patterns2.adapter.bookclasifier;

import com.kodilla.zneref.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.zneref.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.zneref.patterns2.adapter.bookclasifier.model.Book;

import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, Book> books = bookSet.stream()
                .collect(Collectors.toMap(book -> new BookSignature(book.getSignature()), Function.identity()));
        return medianPublicationYear(books);
    }
}
