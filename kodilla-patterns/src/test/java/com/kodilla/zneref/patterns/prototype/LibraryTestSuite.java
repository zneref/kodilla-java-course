package com.kodilla.zneref.patterns.prototype;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Optional;

public class LibraryTestSuite {

    @Test
    public void testGetBooksWithShallowCopy() {
        //Given
        Library library = new Library("Biblioteka Narodowa");
        library.getBooks().add(new Book("Potop", "Henryk Sienkiewicz", LocalDate.of(1970, 10, 9)));
        library.getBooks().add(new Book("Ogniem i mieczem", "Henryk Sienkiewicz", LocalDate.of(1971, 4, 2)));

        Library clone = null;

        try {
            clone = library.shallowCopy();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        clone = Optional.ofNullable(clone).orElse(new Library("Empty library"));

        //When
        clone.getBooks().clear();

        //Then
        System.out.println(clone.getName());

        Assert.assertEquals(0, library.getBooks().size());
        Assert.assertEquals(0, clone.getBooks().size());
    }

    @Test
    public void testGetBooksWithDeepCopy() {
        //Given
        Library library = new Library("Biblioteka Uniwersytecka");
        library.getBooks().add(new Book("Potop", "Henryk Sienkiewicz", LocalDate.of(1970, 10, 9)));
        library.getBooks().add(new Book("Ogniem i mieczem", "Henryk Sienkiewicz", LocalDate.of(1971, 4, 2)));

        Library clone = null;

        try {
            clone = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        clone = Optional.ofNullable(clone).orElse(new Library("Empty library"));

        //When
        clone.getBooks().add(new Book("Pan Wołodyjowski", "Henryk Sienkiewicz", LocalDate.of(1972, 10, 10)));

        //Then
        System.out.println(clone.getName());

        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(3, clone.getBooks().size());
    }

}