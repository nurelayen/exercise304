package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    TaskRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Task task;
        task = new Task("Teacher", "01/08/2019","High");
        repository.save(task);

        task = new Task("Programer", "01/02/2018","medium");
        repository.save(task);

        task = new Task("Design", "01/09/2020","Low");
        repository.save(task);
    }
}
