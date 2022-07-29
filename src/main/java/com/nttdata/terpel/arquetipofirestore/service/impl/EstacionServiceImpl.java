package com.nttdata.terpel.arquetipofirestore.service.impl;

import com.nttdata.terpel.arquetipofirestore.model.EstacionDto;
import com.nttdata.terpel.arquetipofirestore.persistence.entidades.Estaciones;
import com.nttdata.terpel.arquetipofirestore.persistence.repositorio.EstacionRepository;
import com.nttdata.terpel.arquetipofirestore.service.EstacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class EstacionServiceImpl implements EstacionService {


    @Autowired
    private EstacionRepository estacionRepository;


    @Override
    public Estaciones save(Estaciones estaciones) {
        return estacionRepository.save(estaciones);
    }

    @Override
    public List<EstacionDto> retrieveAll() {

        Iterable<Estaciones> books = estacionRepository.findAll();
        List<Estaciones> estacionesList = new ArrayList<>();
        books.forEach(estacionesList::add);
        return construirmodelo(estacionesList);
    }

    private List<EstacionDto> construirmodelo(List<Estaciones> paisLista){

        ArrayList<EstacionDto> paisArrayList =new ArrayList<>();
        for (Estaciones model : paisLista) {
            EstacionDto pais = new EstacionDto();
            pais.setEstacion(model.getEstacion());
            pais.setTraduccion(model.getTraduccion());
            pais.setAcumulacion(true);
            pais.setReclamacion(true);
            paisArrayList.add(pais);
        }
        return paisArrayList;
    }

    @Override
    public Optional<Estaciones> get(String documentId) {
        return estacionRepository.findById(documentId);
    }

    @Override
    public void  delete(Estaciones estaciones) {
        estacionRepository.delete(estaciones);
    }


}
