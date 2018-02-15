package com.kodilla.zneref.patterns.strategy.social;

public abstract class User {

    private final String name;
    protected SocialPublisher publisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String sharePost() {
        return publisher.share();
    }

    void setPublisher(SocialPublisher publisher) {
        this.publisher = publisher;
    }
}
