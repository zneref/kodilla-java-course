package com.kodilla.zneref.stream.forumuser;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public final class Forum {
    private static final Forum INSTANCE = new Forum();
    private final List<ForumUser> users;

    private Forum() {
        users = Arrays.asList(
                new ForumUser(1, "john", 'M', LocalDate.of(1984, 6, 4), 19),
                new ForumUser(2, "katie", 'F', LocalDate.of(1978, 2, 25), 3),
                new ForumUser(3, "barbara", 'F', LocalDate.of(1999, 1, 31), 0),
                new ForumUser(4, "steve", 'M', LocalDate.of(2003, 9, 2), 12),
                new ForumUser(5, "richard", 'M', LocalDate.of(1977, 4, 6), 10),
                new ForumUser(6, "brian", 'M', LocalDate.of(1966, 11, 12), 50),
                new ForumUser(7, "ann", 'F', LocalDate.of(2001, 3, 6), 0),
                new ForumUser(8, "lucy", 'F', LocalDate.of(1993, 7, 20), 6),
                new ForumUser(9, "johny", 'M', LocalDate.of(1989, 8, 31), 0),
                new ForumUser(10, "pamela", 'F', LocalDate.of(2002, 12, 7), 14),
                new ForumUser(11, "damian", 'M', LocalDate.of(1999, 10, 15), 60),
                new ForumUser(12, "charlie", 'M', LocalDate.of(1976, 6, 3), 5),
                new ForumUser(13, "maria", 'F', LocalDate.of(1994, 8, 4), 0),
                new ForumUser(14, "tess", 'F', LocalDate.of(1997, 12, 24), 15),
                new ForumUser(15, "peter", 'M', LocalDate.of(1980, 1, 12), 2));
    }

    public static Forum getInstance() {
        return INSTANCE;
    }

    public List<ForumUser> getUsers() {
        return users;
    }
}
