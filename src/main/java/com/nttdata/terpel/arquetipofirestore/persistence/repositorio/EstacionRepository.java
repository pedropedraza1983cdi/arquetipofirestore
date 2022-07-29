package com.nttdata.terpel.arquetipofirestore.persistence.repositorio;

import com.nttdata.terpel.arquetipofirestore.persistence.entidades.Estaciones;
import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;

public interface EstacionRepository extends DatastoreRepository<Estaciones,String> {

}
