package com.kodilla.zneref.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean
    public TaskList toDo() {
        return new TaskList();
    }

    @Bean
    public TaskList progress() {
        return new TaskList();
    }

    @Bean
    public TaskList done() {
        return new TaskList();
    }

    @Bean
    public Board board() {
        return new Board(toDo(), progress(), done());
    }
}
