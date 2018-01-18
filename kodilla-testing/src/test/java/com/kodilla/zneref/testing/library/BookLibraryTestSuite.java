package com.kodilla.zneref.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookLibraryTestSuite {
    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);
        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");
        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThanTwenty() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);

        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FourtyBooks"))
                .thenReturn(resultListOf40Books);
        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FourtyBooks");
        // Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThanThree() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);
        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");
        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    /*
     *@author Marian Ferenz
     */
    @Test
    public void testListBooksInHandsOfWithNoBooks() {
        // given
        LibraryUser usr = new LibraryUser("John", "Kowalsky", "9876543");
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        List<Book> books = new ArrayList<>();
        when(libraryDatabaseMock.listBooksInHandsOf(usr)).thenReturn(books);
        // when
        BookLibrary lib = new BookLibrary(libraryDatabaseMock);
        List<Book> result = lib.listBooksInHandsOf(usr);
        // then
        assertEquals(0, result.size());
    }

    @Test
    public void testListBooksInHandsOfWithOneBooks() {
        testListBooksInHandsOfWith(1);
    }

    @Test
    public void testListBooksInHandsOfWithFifeBooks() {
        testListBooksInHandsOfWith(5);
    }

    private void testListBooksInHandsOfWith(int booksQuantity) {
        // given
        LibraryUser usr = new LibraryUser("John", "Kowalsky", "9876543");
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        List<Book> books = generateListOfNBooks(booksQuantity);
        when(libraryDatabaseMock.listBooksInHandsOf(usr)).thenReturn(books);
        // when
        BookLibrary lib = new BookLibrary(libraryDatabaseMock);
        List<Book> result = lib.listBooksInHandsOf(usr);
        // then
        verify(libraryDatabaseMock, times(1)).listBooksInHandsOf(usr);
        assertEquals(booksQuantity, result.size());
        assertThat(result).containsExactlyElementsOf(books);
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
}