package com.example.Microservice.Repository;

import com.example.Microservice.Domain.Entities.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FournisseurRepository extends JpaRepository<Fournisseur,Long> {
    Fournisseur findFournisseurByFournisseurId(int id);
}