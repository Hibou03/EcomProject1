package com.testapp.customservice.repository;

import com.testapp.customservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource //Anotation fournie par springdatarest qui permet de demander à spring de démarrer auotmatiquement
// un webservice restful qui permet d'accéder à tout les méthodes qui sont ds l'interface
public interface CustomerRepository extends JpaRepository <Customer, Long>{

}