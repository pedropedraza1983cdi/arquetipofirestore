package com.nttdata.terpel.arquetipofirestore.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String author;
    private String title;
    private Integer year;
}
