package com.nttdata.terpel.arquetipofirestore.persistence.repositorio;

import com.google.cloud.firestore.Firestore;
import com.nttdata.terpel.arquetipofirestore.persistence.entidades.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends AbstractFirestoreRepository<User> {
    protected UserRepository(Firestore firestore) {
        super(firestore, "User");
    }
}
