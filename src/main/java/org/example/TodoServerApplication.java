package org.example;

import lombok.extern.slf4j.Slf4j;
import org.example.repository.TodoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class TodoServerApplication {
    public static void main(String[] args) {
        log.info("SYSTEM RUN: HELLO TO-DO");
        SpringApplication.run(TodoServerApplication.class, args);
    }
}
