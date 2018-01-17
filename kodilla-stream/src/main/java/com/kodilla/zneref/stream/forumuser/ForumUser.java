package com.kodilla.zneref.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int id;
    private final String name;
    private final char sex;
    private final LocalDate birthday;
    private final int postCnt;

    public ForumUser(int id, String name, char sex, LocalDate birthday, int postCnt) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.postCnt = postCnt;
    }

    public int getId() {
        return id;
    }

    public boolean isMale() {
        return sex == 'M';
    }

    public boolean isOlderThan(int years) {
        return LocalDate.now().getYear() - birthday.getYear() >= years;
    }

    public boolean hasAtLeastPosts(int posts) {
        return postCnt >= posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", postCnt=" + postCnt +
                '}';
    }
}
