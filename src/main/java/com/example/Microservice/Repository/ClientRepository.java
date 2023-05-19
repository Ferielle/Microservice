package com.example.Microservice.Repository;

import com.example.Microservice.Domain.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
    Client findClientById(int Id);
}