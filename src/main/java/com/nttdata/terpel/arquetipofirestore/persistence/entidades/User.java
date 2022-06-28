package com.nttdata.terpel.arquetipofirestore.persistence.entidades;

import com.google.cloud.firestore.annotation.DocumentId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "1")
public class User {

    @DocumentId
    private String id;
    private String username;
    private String password;
    private String imageUrl;
    private String bio;
}
