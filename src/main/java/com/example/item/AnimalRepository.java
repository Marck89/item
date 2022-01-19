package com.example.item;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.item.model.Animal;

public interface AnimalRepository extends MongoRepository<Animal, String> {
  List<Animal> findByNomeContaining(String nome);
  List<Animal> findByEstinto(boolean estinto);
}