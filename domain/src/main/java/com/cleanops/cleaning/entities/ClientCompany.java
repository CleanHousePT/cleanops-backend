package com.cleanops.cleaning.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class ClientCompany {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private Integer vat;
    private String address;
    private Integer phone;
    private String email;

}
