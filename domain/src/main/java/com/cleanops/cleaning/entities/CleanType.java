package com.cleanops.cleaning.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor

public class CleanType {
    @Id
    @GeneratedValue

    private Long id;
    private String name;
    private String description;
    //id
    //nome (industrial pesada, hospitalar, química)
    //descrição
    //nível_risco (baixo, médio, alto)

}
