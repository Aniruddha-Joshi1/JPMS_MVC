package com.example.service.impl;

import com.example.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.entity.ExampleEntity;
import com.example.repository.ExampleRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ExampleServiceImpl implements ExampleService {
    private final ExampleRepository exampleRepository;

    @Autowired
    public ExampleServiceImpl(ExampleRepository exampleRepository) {
        this.exampleRepository = exampleRepository;
    }

    @Override
    public Optional<ExampleEntity> getExample(long id) {
        return exampleRepository.findById(id);
    }

    @Override
    public List<ExampleEntity> getAllExamples() {
        return exampleRepository.findAll();
    }

    @Override
    public ExampleEntity addExample(String name) {
        ExampleEntity exampleEntity = new ExampleEntity();
        exampleEntity.setName(name);
        return exampleRepository.save(exampleEntity);
    }
}
