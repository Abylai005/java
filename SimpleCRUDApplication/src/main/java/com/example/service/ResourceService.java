package com.example.service;

import com.example.model.Resource;
import com.example.repository.ResourceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResourceService {
    private final ResourceRepository repository;

    public ResourceService(ResourceRepository repository) {
        this.repository = repository;
    }

    public List<Resource> findAll() {
        return repository.findAll();
    }

    public Optional<Resource> findById(Long id) {
        return repository.findById(id);
    }

    public Resource save(Resource resource) {
        return repository.save(resource);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
