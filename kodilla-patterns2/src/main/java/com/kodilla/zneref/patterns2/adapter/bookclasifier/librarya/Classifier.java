package com.kodilla.zneref.patterns2.adapter.bookclasifier.librarya;

import com.kodilla.zneref.patterns2.adapter.bookclasifier.model.Book;

import java.util.Set;

public interface Classifier {
    int publicationYearMedian(Set<Book> bookSet);
}
