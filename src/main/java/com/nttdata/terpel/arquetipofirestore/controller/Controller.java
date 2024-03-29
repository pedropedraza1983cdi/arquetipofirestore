package com.nttdata.terpel.arquetipofirestore.controller;


import com.nttdata.terpel.arquetipofirestore.persistence.entidades.User;
import com.nttdata.terpel.arquetipofirestore.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "${service.controller.path}")
public class Controller {

    @Autowired
    private PersonService personService;

    @GetMapping("/all")
    public List<User> getAllPerson() throws InterruptedException, ExecutionException {
        return personService.retrieveAll();
    }

    @GetMapping("/get/{id}")
    public Optional<User> getPerson(@PathVariable("id") String id) throws InterruptedException, ExecutionException {
        return personService.get(id);
    }

    @PostMapping("/save")
    public boolean addPerson(@RequestBody User person) throws InterruptedException, ExecutionException {
        return personService.save(person);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody User person) throws InterruptedException, ExecutionException {
        personService.delete(person);
        return "Datos Eliminados";
    }


}