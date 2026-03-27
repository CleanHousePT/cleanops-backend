package com.cleanops.cleaning.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class PlaceExecution {
    @Id
    @GeneratedValue

    private Long id;
    private double lat;
    private double lon;
    //nome(ex:fábrica X- setor químico)
    //nível_risco
    //Id_EmpresaCliente

}
