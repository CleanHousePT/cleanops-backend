package com.cleanops.cleaning.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class NonCompliance {
    @Id
    @GeneratedValue

    private Long id;
    //audit_ID
    private String description;
    //Gravidade?(menor, maior, médio)
    //corrective_action
}
