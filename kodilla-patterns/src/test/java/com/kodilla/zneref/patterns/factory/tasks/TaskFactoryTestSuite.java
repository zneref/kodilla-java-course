package com.kodilla.zneref.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaskFactoryTestSuite {

    @Test
    public void createShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.createTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertTrue(TaskFactory.SHOPPING.equals(task.getTaskName()));
    }

    @Test
    public void createPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.createTask(TaskFactory.PAINTING);
        //Then
        Assert.assertTrue(TaskFactory.PAINTING.equals(task.getTaskName()));
    }

    @Test
    public void createDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.createTask(TaskFactory.DRIVING);
        //Then
        Assert.assertTrue(TaskFactory.DRIVING.equals(task.getTaskName()));
    }
}