package com.kodilla.zneref.patterns.prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library implements Cloneable {
    private final String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clone = (Library) super.clone();
        clone.books = new HashSet<>(books);
        return clone;
    }
}