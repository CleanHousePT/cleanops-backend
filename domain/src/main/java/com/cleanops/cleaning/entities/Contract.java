package com.cleanops.cleaning.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Contract {
    @Id
    @GeneratedValue
    private Long id;

    private Integer contractNumber;
    private java.time.LocalDate startDate;
    private java.time.LocalDate endDate;

}
