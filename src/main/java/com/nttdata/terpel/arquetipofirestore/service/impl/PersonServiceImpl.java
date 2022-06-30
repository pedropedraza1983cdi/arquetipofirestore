package com.nttdata.terpel.arquetipofirestore.service.impl;

import com.nttdata.terpel.arquetipofirestore.persistence.entidades.User;
import com.nttdata.terpel.arquetipofirestore.persistence.repositorio.UserRepository;
import com.nttdata.terpel.arquetipofirestore.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class PersonServiceImpl implements PersonService {


    @Autowired
    private UserRepository userRepository;


    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<com.nttdata.terpel.arquetipofirestore.model.User> retrieveAll() {

        Iterable<User> books = userRepository.findAll();
        List<User> userList = new ArrayList<>();
        books.forEach(userList::add);
        return construirmodelo(userList);
    }

    private List<com.nttdata.terpel.arquetipofirestore.model.User> construirmodelo(List<User> paisLista){

        ArrayList<com.nttdata.terpel.arquetipofirestore.model.User> paisArrayList =new ArrayList<>();
        for (User model : paisLista) {
            com.nttdata.terpel.arquetipofirestore.model.User pais = new com.nttdata.terpel.arquetipofirestore.model.User();
            pais.setAuthor(model.getAuthor());
            pais.setTitle(model.getTitle());
            pais.setYear(model.getYear());
            paisArrayList.add(pais);
        }
        return paisArrayList;
    }

    @Override
    public Optional<User> get(String documentId) {
        return userRepository.findById(documentId);
    }

    @Override
    public void  delete(User user) {
        userRepository.delete(user);
    }


}
