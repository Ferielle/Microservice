package com.example.Microservice.Domain.DTO;


import com.example.Microservice.Domain.Entities.Client;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class ClientDTO implements Serializable {
    private int id;
    private String Nom;
    private String Adresse;
    private String Numéro_de_téléphone;
    private String email;
    private String dateNaissance;
    private String genre;
    private String dateInscription;
    private String nationalite;
    private String statutCompte;
    private String historiqueAchats;
    private String informationsPaiement;

    public Client toEntity() {
        return Client.builder()
                .nationalite(nationalite)
                .statutCompte(statutCompte)
                .historiqueAchats(historiqueAchats)
                .informationsPaiement(informationsPaiement)
                .build();
    }




}