package com.example.web.controller;

import com.example.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.entity.ExampleEntity;

import java.util.List;

@RestController
@RequestMapping("/example")
public class ExampleController {

    private final ExampleService exampleService;

    @Autowired
    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @GetMapping("/{id}")
    public ExampleEntity getExample(@PathVariable Long id) {
        return exampleService.getExample(id).orElse(null);
    }

    @GetMapping("/all")
    public List<ExampleEntity> getAllExamples() {
        return exampleService.getAllExamples();
    }

    @PostMapping("/add/{name}")
    public ExampleEntity addExample(@PathVariable String name) {
        return exampleService.addExample(name);
    }
}
