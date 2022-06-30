package com.nttdata.terpel.arquetipofirestore.controller;


import com.nttdata.terpel.arquetipofirestore.persistence.entidades.User;
import com.nttdata.terpel.arquetipofirestore.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "${service.controller.path}")
public class Controller {

    @Autowired
    private PersonService personService;

    @GetMapping("/all")
    public List<com.nttdata.terpel.arquetipofirestore.model.User> getAllPerson() {
        return personService.retrieveAll();
    }

    @GetMapping("/get/{id}")
    public Optional<User> getPerson(@PathVariable("id") String id) {
        return personService.get(id);
    }

    @PostMapping("/save")
    public User addPerson(@RequestBody User person){
        return personService.save(person);
    }

    @DeleteMapping("/delete")
       void delete(@RequestBody User person) {
        personService.delete(person);

    }


}