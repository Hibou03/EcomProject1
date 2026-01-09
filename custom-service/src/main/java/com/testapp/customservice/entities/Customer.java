package com.testapp.customservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder //Ces anotations c'est du lombok
public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //ces anotations c'est du JPA
    private Long id;
    private String name;
    private String email;
}
