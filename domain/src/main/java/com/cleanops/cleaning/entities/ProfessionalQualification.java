package com.cleanops.cleaning.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
public class ProfessionalQualification {
    @Id
    @GeneratedValue

    private Long id;
    //profissional_id
    //certification_id
    private Date dateObtained;
    private Date expDate;
}
