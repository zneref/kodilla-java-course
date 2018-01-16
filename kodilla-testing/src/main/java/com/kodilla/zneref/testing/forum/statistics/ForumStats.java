package com.kodilla.zneref.testing.forum.statistics;

public class ForumStats {
    private int posts;
    private int users;
    private int comments;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        posts = statistics.postsCount();
        users = statistics.usersNames().size();
        comments = statistics.commentsCount();

        try {
            averagePostsPerUser = posts / users;
            averageCommentsPerUser = comments / users;
            averageCommentsPerPost = comments / posts;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("division by 0");
        }
    }

    public int getPosts() {
        return posts;
    }

    public int getUsers() {
        return users;
    }

    public int getComments() {
        return comments;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void show() {
        System.out.println("Forum:\n" +
                "Total users: " + users + "\n" +
                "Total posts: " + posts + "\n" +
                "Total comments: " + comments + "\n" +
                "Average post per user: " + averagePostsPerUser + "\n" +
                "Average comments per user: " + averageCommentsPerUser + "\n" +
                "Average comments per post: " + averageCommentsPerPost);
    }
}
