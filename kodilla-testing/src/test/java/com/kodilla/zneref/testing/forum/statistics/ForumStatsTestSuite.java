package com.kodilla.zneref.testing.forum.statistics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatsTestSuite {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void calculateAdvStatisticsForZeroPosts() {
        final int posts = 0, comments = 2000;
        final List<String> users = Arrays.asList("jon", "jake", "katie", "stevie", "barbara");
        // given
        Statistics mockStats = mock(Statistics.class);
        when(mockStats.postsCount()).thenReturn(posts);
        when(mockStats.commentsCount()).thenReturn(comments);
        when(mockStats.usersNames()).thenReturn(users);
        // when, then
        ForumStats stats = new ForumStats();
        assertThatIllegalArgumentException()
                .isThrownBy(() -> stats.calculateAdvStatistics(mockStats))
                .withMessage("division by 0");

    }

    @Test
    public void calculateAdvStatisticsForZeroUsers() {
        final int posts = 1000, comments = 2000;
        final List<String> users = new ArrayList<>();
        // given
        Statistics mockStats = mock(Statistics.class);
        when(mockStats.postsCount()).thenReturn(posts);
        when(mockStats.commentsCount()).thenReturn(comments);
        when(mockStats.usersNames()).thenReturn(users);
        // when, then
        ForumStats stats = new ForumStats();
        assertThatIllegalArgumentException()
                .isThrownBy(() -> stats.calculateAdvStatistics(mockStats))
                .withMessage("division by 0");

    }

    @Test
    public void calculateAdvStatisticsForZeroComments() {
        final int posts = 1000, comments = 0;
        final List<String> users = Arrays.asList("jon", "jake", "katie", "stevie", "barbara");

        testIt(posts, comments, users);
    }

    @Test
    public void calculateAdvStatisticsForThousandPosts() {
        final int posts = 1000, comments = 2000;
        final List<String> users = Arrays.asList("jon", "jake", "katie", "stevie", "barbara");

        testIt(posts, comments, users);
    }

    @Test
    public void calculateAdvStatisticsForPostsGreaterThanComments() {
        final int posts = 5000, comments = 2000;
        final List<String> users = Arrays.asList("jon", "jake", "katie", "stevie", "barbara");

        testIt(posts, comments, users);
    }

    @Test
    public void calculateAdvStatisticsForPostsSmallerThanComments() {
        final int posts = 50, comments = 2000;
        final List<String> users = Arrays.asList("jon", "jake", "katie", "stevie", "barbara");

        testIt(posts, comments, users);
    }

    @Test
    public void calculateAdvStatisticsForHundredUsers() {
        final int posts = 1000, comments = 2000;
        List<String> users = new ArrayList<>();

        for (int i = 1; i < 101; i++) users.add("User no: " + i);

        testIt(posts, comments, users);
    }

    private void testIt(int posts, int comments, List<String> users) {
        double ppu = posts / users.size();
        double cpp = comments /posts;
        double cpu = comments /users.size();
        // given
        Statistics mockStats = mock(Statistics.class);
        when(mockStats.postsCount()).thenReturn(posts);
        when(mockStats.commentsCount()).thenReturn(comments);
        when(mockStats.usersNames()).thenReturn(users);
        // when
        ForumStats stats = new ForumStats();
        stats.calculateAdvStatistics(mockStats);
        // then
        assertThat(posts).isEqualTo(stats.getPosts());
        assertThat(comments).isEqualTo(stats.getComments());
        assertThat(users.size()).isEqualTo(stats.getUsers());
        assertThat(ppu).isEqualTo(stats.getAveragePostsPerUser());
        assertThat(cpp).isEqualTo(stats.getAverageCommentsPerPost());
        assertThat(cpu).isEqualTo(stats.getAverageCommentsPerUser());
    }
}