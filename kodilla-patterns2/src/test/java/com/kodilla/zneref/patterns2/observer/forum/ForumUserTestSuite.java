package com.kodilla.zneref.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.*;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser user1 = new ForumUser("User 1");
        ForumUser user2 = new ForumUser("User 2");
        ForumUser user3 = new ForumUser("User 3");
        javaHelpForum.registryObserver(user1);
        javaHelpForum.registryObserver(user2);
        javaToolsForum.registryObserver(user1);
        javaToolsForum.registryObserver(user3);

        //When
        javaHelpForum.addPost("post1");
        javaHelpForum.addPost("post2");
        javaHelpForum.addPost("post3");
        javaToolsForum.addPost("post4");
        javaToolsForum.addPost("post5");

        //Then
        assertEquals(5, user1.getUpdateCount());
    }

}