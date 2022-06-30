package com.nttdata.terpel.arquetipofirestore.persistence.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "books")
public class User {

    @Id
    private String id;
    private String author;
    private String title;
    private Integer year;
}
