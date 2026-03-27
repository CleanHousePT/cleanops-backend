package com.cleanops.cleaning.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Team {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    //supervisor_ID

    //Sem esquecer relacionamento (Equipa N: N profissional)
}
