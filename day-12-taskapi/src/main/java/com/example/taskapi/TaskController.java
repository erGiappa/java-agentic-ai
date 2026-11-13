
package com.example.taskapi;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.net.URI;




@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private static final Logger log =
            LoggerFactory.getLogger(TaskController.class);

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }



    // GET: recupera tutti i task
    @GetMapping
    public List<Task> getAllTasks() {
        return service.findAll();
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

        log.info("Creazione nuovo task: {}", newTask.getTitle());


        Task created = service.create(newTask);

        URI location = URI.create("/api/tasks/" + created.getId());

        return ResponseEntity.created(location).body(created);
    }

    // GET: recupera un task tramite ID
    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable long id) {

        return service.findAll().stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // DELETE: elimina un task tramite ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable long id) {

        boolean removed = service.findAll().removeIf(t -> t.getId() == id);

        return removed ? ResponseEntity.noContent().build()
                : ResponseEntity.notFound().build();
    }


    // PUT: modifica un task tramite ID
    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(
            @PathVariable long id,
            @RequestBody Task updated) {

        for (Task t : service.findAll()) {

            if (t.getId() == id) {

                t.setTitle(updated.getTitle());
                t.setCompleted(updated.isCompleted());

                return ResponseEntity.ok(t);
            }
        }
        return ResponseEntity.notFound().build();
    }


    // Restituisce tutti i task ordinati alfabeticamente per titolo
    @GetMapping("/ordinati")
    public List<Task> getSortedTasks() {

        return service.findAll().stream()
                .sorted(Comparator.comparing(Task::getTitle))
                .toList();
    }

    // Restituisce i task filtrati in base al loro stato di completamento
    @GetMapping(params = "completed")
    public List<Task> getTasksByCompletion(
            @RequestParam boolean completed) {

        return service.findAll().stream()
                .filter(t -> t.isCompleted() == completed)
                .toList();
    }

    // Restituisce il numero totale di task presenti
    @GetMapping("/count")
    public Map<String, Object> getTaskCount() {

        return Map.of("totalTasks", service.findAll().size());
    }

    //Elimina tutti i task
    @DeleteMapping
    public void clearAll(){
        service.findAll().clear();
    }
}







