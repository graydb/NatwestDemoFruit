package com.natwest.exercise.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.natwest.exercise.persistence.domain.Fruit;
import com.natwest.exercise.persistence.repo.FruitRepo;


@Service
public class FruitService {

 

    public FruitRepo repo;
    
    public FruitService(FruitRepo repo) {
        super();
        this.repo = repo;
        
    }
    //Read all
    public List<Fruit> readAll() {
        return this.repo.findAll();
        
    }
    //Create
    public Fruit addFruit(Fruit fruit) {
        return this.repo.saveAndFlush(fruit);
        
    }
    
    //find by id
    public Fruit findById(Long id) {
        return this.repo.findById(id).orElseThrow();
    }
    
    //Update
    public Fruit update(Long id, Fruit fruit) {
        Fruit exists = this.repo.getById(id);
        System.out.println(exists);
        exists.setType(fruit.getType());
        exists.setAmount(fruit.getAmount());
        exists.setColour(fruit.getColour());
        Fruit updated = this.repo.save(exists);
        return updated;
    }
    
    //delete
    public Boolean delete(Long id) {
        this.repo.deleteById(id);
        return this.repo.existsById(id);
        
    }
    
}


