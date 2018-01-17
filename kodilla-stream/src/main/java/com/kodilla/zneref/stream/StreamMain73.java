package com.kodilla.zneref.stream;

import com.kodilla.zneref.stream.forumuser.Forum;
import com.kodilla.zneref.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain73 {
    public static void main(String[] args) {
        Forum forum = Forum.getInstance();

        Map<Integer, ForumUser> resultMap = forum.getUsers()
                .stream()
                .filter(ForumUser::isMale)
                .filter(user -> user.isOlderThan(20))
                .filter(user -> user.hasAtLeastPosts(1))
                .collect(Collectors.toMap(ForumUser::getId, user -> user));

        resultMap.entrySet().stream()
                .map(entry -> "Map entry: key=" + entry.getKey() + ", value=" + entry.getValue()).forEach(System.out::println);
    }
}
