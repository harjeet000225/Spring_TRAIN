package com.ibm.reactor;

import com.ibm.reactor.entity.Todo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("todo")
public class TodoController {


    @GetMapping
    public Mono<List<Todo>> findAll() {
        return Mono.just(List.of(new Todo(1, 3, "Learn Spring Webflux", false)));
    }

}
