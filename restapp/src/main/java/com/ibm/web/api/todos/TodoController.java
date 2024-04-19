package com.ibm.web.api.todos;

import com.ibm.web.api.todos.entity.Todo;
import com.ibm.web.api.todos.service.TodoService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<Todo> findAll() {
        return todoService.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Todo findById(@PathVariable("id") Long id) {
        return todoService.findById(id);
    }

    @GetMapping
    @RequestMapping("filter")
    public List<Todo> filterByStatus(@RequestParam("status") Boolean status) {
        return todoService.filterBy(status);
    }

    //save
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public Todo save(@RequestBody Todo todo) {
//        return todoService.save(todo);
//    }

    @PostMapping
    public ResponseEntity<Todo> save(@RequestBody Todo todo) {
        return ResponseEntity
                .status(201)
                .header("name", "ibm")
                .header("location", "Banaglore")
                .contentType(MediaType.APPLICATION_JSON)
                .body(todoService.save(todo));
    }

    //update

    @PutMapping
    @RequestMapping("update/{id}")
    public Todo update(@RequestBody Todo todo, @PathParam("id") Long id) {
        return todoService.update(todo, id);
    }
}
