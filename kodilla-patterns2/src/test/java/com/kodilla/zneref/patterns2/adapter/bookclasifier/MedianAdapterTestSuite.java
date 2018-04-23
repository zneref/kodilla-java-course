package com.kodilla.zneref.patterns2.adapter.bookclasifier;

import com.kodilla.zneref.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.zneref.patterns2.adapter.bookclasifier.model.Book;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter adapter = new MedianAdapter();
        Set<Book> bookSet = new HashSet<>();

        bookSet.add(new Book("author#1", "title#1", 2000, "ISBN-1111111"));
        bookSet.add(new Book("author#2", "title#2", 2001, "ISBN-2222222"));
        bookSet.add(new Book("author#3", "title#3", 2002, "ISBN-3333333"));
        bookSet.add(new Book("author#4", "title#4", 2003, "ISBN-4444444"));
        bookSet.add(new Book("author#5", "title#5", 2004, "ISBN-5555555"));
        bookSet.add(new Book("author#6", "title#6", 2005, "ISBN-6666666"));
        bookSet.add(new Book("author#6", "title#7", 2006, "ISBN-7777777"));

        //When
        int median = adapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(2003, median);

    }

}