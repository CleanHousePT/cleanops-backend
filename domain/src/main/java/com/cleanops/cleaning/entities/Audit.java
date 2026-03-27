package com.cleanops.cleaning.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Audit {
    @Id
    @GeneratedValue

    private Long id;
    //ServiceOrder_ID
    private String auditor;
    //resultado(conforme/não conforme)
    private String obs;
}
