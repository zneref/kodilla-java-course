package com.kodilla.zneref.spring.forum;


import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    private final String name;

    public ForumUser() {
        name = "abc";
    }

    public String getName() {
        return name;
    }
}
