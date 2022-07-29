package com.nttdata.terpel.arquetipofirestore.service;


import com.nttdata.terpel.arquetipofirestore.model.EstacionDto;
import com.nttdata.terpel.arquetipofirestore.persistence.entidades.Estaciones;

import java.util.List;
import java.util.Optional;

public interface EstacionService {

     Estaciones save(Estaciones estaciones);

     List<EstacionDto> retrieveAll();

     Optional<Estaciones> get(String documentId);

     void delete(Estaciones estaciones);

}
