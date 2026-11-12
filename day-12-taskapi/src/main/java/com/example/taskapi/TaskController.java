
package com.example.taskapi;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final List<Task> tasks = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong();

    // GET: recupera tutti i task
    @GetMapping
    public List<Task> getAllTasks() {
        return tasks;
    }

    // POST: crea un nuovo task
    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task newTask) {

        if (newTask.getTitle() == null || newTask.getTitle().isBlank()) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Titolo obbligatorio"
            );
        }

        newTask.setId(counter.incrementAndGet());
        tasks.add(newTask);

        return ResponseEntity.status(HttpStatus.CREATED).body(newTask);
    }

    // GET: recupera un task tramite ID
    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable long id) {

        return tasks.stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // DELETE: elimina un task tramite ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable long id) {

        boolean removed = tasks.removeIf(t -> t.getId() == id);

        return removed ? ResponseEntity.noContent().build()
                : ResponseEntity.notFound().build();
    }

    // PUT: modifica un task tramite ID
    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(
            @PathVariable long id,
            @RequestBody Task updated) {

        for (Task t : tasks) {

            if (t.getId() == id) {

                t.setTitle(updated.getTitle());
                t.setCompleted(updated.isCompleted());

                return ResponseEntity.ok(t);
            }
        }

        return ResponseEntity.notFound().build();
    }
}




