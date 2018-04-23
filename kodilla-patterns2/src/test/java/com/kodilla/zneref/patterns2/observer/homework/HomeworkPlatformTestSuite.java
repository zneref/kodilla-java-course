package com.kodilla.zneref.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomeworkPlatformTestSuite {
    @Test
    public void testHomeworkPlatformUpdate() {
        //Given
        HomeworkQueue queue1 = new HomeworkQueue("Learner #1");
        HomeworkQueue queue2 = new HomeworkQueue("Learner #2");
        HomeworkQueue queue3 = new HomeworkQueue("Learner #3");
        HomeworkQueue queue4 = new HomeworkQueue("Learner #4");

        Mentor mentor1 = new Mentor("Mentor #1");
        Mentor mentor2 = new Mentor("Mentor #2");

        queue1.registryObserver(mentor1);
        queue2.registryObserver(mentor1);
        queue3.registryObserver(mentor2);
        queue4.registryObserver(mentor2);

        //When
        //mentor1
        queue1.addHomework("Solution #1");
        queue1.addHomework("Solution #2");
        queue2.addHomework("Solution #1");
        queue2.addHomework("Solution #2");
        queue2.addHomework("Solution #3");
        //mentor2
        queue3.addHomework("Solution #1");
        queue4.addHomework("Solution #1");
        queue4.addHomework("Solution #2");
        queue4.addHomework("Solution #3");
        queue4.addHomework("Solution #4");

        //Then
        Assert.assertEquals(5, mentor1.getCounter());
        Assert.assertEquals(5, mentor2.getCounter());
    }

}