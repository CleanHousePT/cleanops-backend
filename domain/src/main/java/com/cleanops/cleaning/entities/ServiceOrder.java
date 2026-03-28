package com.cleanops.cleaning.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
public class ServiceOrder {
    @Id
    @GeneratedValue

    private Long id;
    private Date executionDate;
    //status(planeada, em execução, concluída, auditada)
    //Contract_ID
    //LocalExecution-ID
    //CleaningType_ID
    //Team_ID
}
