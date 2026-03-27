package com.cleanops.cleaning.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor

public class Certification {
    @Id
    @GeneratedValue

    private Long id;
    private String name; //(ex: ISO 9001, HACCP, limpeza hospitalar nível 3
    private String issuingEntity;
    private Date validity;

}
