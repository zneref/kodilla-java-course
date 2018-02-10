package com.kodilla.zneref.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.addToDoTask("to do task");
        board.addInProgressTask("in progress task");
        board.addDoneTask("done task");
        //Then
        board.getToDoList().getTasks().stream().forEach(System.out::println);
        board.getInProgressList().getTasks().stream().forEach(System.out::println);
        board.getDoneList().getTasks().stream().forEach(System.out::println);
    }
}