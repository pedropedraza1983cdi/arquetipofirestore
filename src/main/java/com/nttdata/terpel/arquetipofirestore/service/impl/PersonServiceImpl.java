package com.nttdata.terpel.arquetipofirestore.service.impl;

import com.nttdata.terpel.arquetipofirestore.persistence.entidades.User;
import com.nttdata.terpel.arquetipofirestore.persistence.repositorio.UserRepository;
import com.nttdata.terpel.arquetipofirestore.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PersonServiceImpl implements PersonService {


    @Autowired
    private UserRepository userRepository;


    @Override
    public boolean save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> retrieveAll() {
        return userRepository.retrieveAll();
    }

    @Override
    public Optional<User> get(String documentId) {
        return userRepository.get(documentId);
    }

    @Override
    public String delete(User user) {
       return userRepository.delete(user);
    }


}
