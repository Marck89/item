package com.example.item.controller;

import java.util.List;
import java.util.Optional;

import com.example.item.AnimalRepository;
import com.example.item.model.Animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class AnimalController {

  @Autowired
  AnimalRepository animalRepository;

  @GetMapping("/Animals")
  public List<Animal> getAllAnimals(@RequestParam(required = false) String name) {
    return animalRepository.findAll();
    
  }

  @GetMapping("/Animals/{id}")
  public Optional<Animal>  getAnimalById(@PathVariable("id") String id) {
    return  animalRepository.findById(id);
    
  }

  @PostMapping("/Animals")
  public Animal createAnimal(@RequestBody Animal Animal) {
        
        return animalRepository.save(Animal);
  }

  @PutMapping("/Animals/{id}")
  public Animal updateAnimal(@PathVariable("id") String id, @RequestBody Animal animal) {
        return animalRepository.save(animal);
  }

  @DeleteMapping("/Animals/{id}")
  public void deleteAnimal(@PathVariable("id") String id) {
     animalRepository.deleteById(id);
  }

  @DeleteMapping("/Animals")
  public void deleteAllAnimals() {
    animalRepository.deleteAll();
  }

  @GetMapping("/Animals/published")
  public List<Animal> findByEstinto() {
    return animalRepository.findByEstinto(true);
    
  }

}