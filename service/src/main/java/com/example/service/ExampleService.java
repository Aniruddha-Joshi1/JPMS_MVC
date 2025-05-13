package com.example.service;

import com.example.entity.ExampleEntity;

import java.util.List;
import java.util.Optional;

public interface ExampleService {
    Optional<ExampleEntity> getExample(long id);

    List<ExampleEntity> getAllExamples();

    ExampleEntity addExample(String name);
}
