package com.nttdata.terpel.arquetipofirestore.persistence.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "estaciones")
public class Estaciones {

    @Id
    private Long id;
    private boolean acumulacion;
    private Integer estacion;
    private boolean reclamacion;
    private Integer traduccion;
}
