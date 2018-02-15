package com.kodilla.zneref.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User millenials = new Millenials("Millenials");
        User yGeneration = new YGeneration("YGeneration");
        User zGeneration = new ZGeneration("ZGeneration");

        //When
        String facebook = millenials.sharePost();
        String twitter = yGeneration.sharePost();
        String snapchat = zGeneration.sharePost();

        //Then
        Assert.assertEquals("Facebook", facebook);
        Assert.assertEquals("Twitter", twitter);
        Assert.assertEquals("Snapchat", snapchat);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User millenials = new Millenials("Millenials");
        millenials.setPublisher(() -> "Instagram");

        //When
        String insta = millenials.sharePost();

        //Then
        Assert.assertTrue(insta.equals("Instagram"));

    }
}