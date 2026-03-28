package com.cleanops.cleaning.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class OperationalChecklist {
    @Id
    @GeneratedValue

    private Long id;
    //ServiceOrder_ID
    //Item
    private boolean mandatory;
    private boolean finished;
}
