package com.nttdata.terpel.arquetipofirestore.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstacionDto {

    private boolean acumulacion;
    private Integer estacion;
    private boolean reclamacion;
    private Integer traduccion;
}
