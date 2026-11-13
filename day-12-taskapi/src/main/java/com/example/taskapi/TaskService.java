package com.example.taskapi;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private final List<Task> tasks = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong();

    //Restituisce tutti i task
    public List<Task> findAll() {
        return tasks;
    }

    //Crea un nuovo task
    public Task create(Task t) {
        t.setId(counter.incrementAndGet());
        tasks.add(t);
        return t;
    }
}
