package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.flower.Flower;

@RepositoryRestResource
@CrossOrigin(origins = "*")
public interface FlowerRepository extends JpaRepository<Flower, Long> {
    
}