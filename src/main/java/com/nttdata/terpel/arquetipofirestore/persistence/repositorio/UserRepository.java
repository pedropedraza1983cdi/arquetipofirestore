package com.nttdata.terpel.arquetipofirestore.persistence.repositorio;

import com.nttdata.terpel.arquetipofirestore.persistence.entidades.User;
import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;

public interface UserRepository extends DatastoreRepository<User,String> {

}
