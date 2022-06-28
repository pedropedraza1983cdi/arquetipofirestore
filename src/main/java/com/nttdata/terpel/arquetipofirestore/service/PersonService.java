package com.nttdata.terpel.arquetipofirestore.service;


import com.nttdata.terpel.arquetipofirestore.persistence.entidades.User;

import java.util.List;
import java.util.Optional;

public interface PersonService  {

    public boolean save(User user);

    public List<User> retrieveAll();

    Optional<User> get(String documentId);

    String delete(User user);

}
