package com.nttdata.terpel.arquetipofirestore.service;


import com.nttdata.terpel.arquetipofirestore.persistence.entidades.User;

import java.util.List;
import java.util.Optional;

public interface PersonService  {

     User save(User user);

     List<com.nttdata.terpel.arquetipofirestore.model.User> retrieveAll();

    Optional<User> get(String documentId);

    void delete(User user);

}
