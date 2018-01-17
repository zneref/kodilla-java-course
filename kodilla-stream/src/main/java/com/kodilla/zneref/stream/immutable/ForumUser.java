package com.kodilla.zneref.stream.immutable;

public final class ForumUser {
    private final String username;
    private final String realname;

    public ForumUser(String username, String realname) {
        this.username = username;
        this.realname = realname;
    }

    public String getUsername() {
        return username;
    }

    public String getRealname() {
        return realname;
    }
}
