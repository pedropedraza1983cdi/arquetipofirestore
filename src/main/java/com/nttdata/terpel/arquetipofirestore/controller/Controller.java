package com.nttdata.terpel.arquetipofirestore.controller;


import com.nttdata.terpel.arquetipofirestore.model.EstacionDto;
import com.nttdata.terpel.arquetipofirestore.persistence.entidades.Estaciones;
import com.nttdata.terpel.arquetipofirestore.service.EstacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "${service.controller.path}")
public class Controller {

    @Autowired
    private EstacionService estacionService;

    @GetMapping("/all")
    public List<EstacionDto> getAllPerson() {
        return estacionService.retrieveAll();
    }

    @GetMapping("/get/{id}")
    public Optional<Estaciones> getPerson(@PathVariable("id") String id) {
        return estacionService.get(id);
    }

    @PostMapping("/save")
    public String addPerson(@RequestBody Estaciones person){
        estacionService.save(person);
        return "guardado";
    }

    @DeleteMapping("/delete")
       void delete(@RequestBody Estaciones person) {
        estacionService.delete(person);

    }


}