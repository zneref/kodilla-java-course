package com.kodilla.zneref.stream;

import com.kodilla.zneref.stream.forumuser.Forum;
import com.kodilla.zneref.stream.forumuser.ForumUser;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamMain73 {
    public static void main(String[] args) {
        Forum forum = Forum.getInstance();

        Predicate<ForumUser> isMale = ForumUser::isMale;
        Predicate<ForumUser> isOlder = forumUser -> forumUser.isOlderThan(20);
        Predicate<ForumUser> hasPost = forumUser -> forumUser.hasAtLeastPosts(1);

        List<Predicate<ForumUser>> predicates = Arrays.asList(isMale, isOlder, hasPost);
        Predicate<ForumUser> reduced = predicates.stream().reduce(x -> true, Predicate::and);
        Predicate<ForumUser> matched = forumUser -> predicates.stream().allMatch(f -> f.test(forumUser));

        Map<Integer, ForumUser> resultMap = forum.getUsers().stream().filter(matched)
                .collect(Collectors.toMap(ForumUser::getId, user -> user));

        resultMap.entrySet().stream()
                .map(entry -> "Map entry: key=" + entry.getKey() + ", value=" + entry.getValue()).forEach(System.out::println);
    }
}
