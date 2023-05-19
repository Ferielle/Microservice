package com.example.Microservice.Domain.DTO;

import com.example.Microservice.Domain.Entities.Fournisseur;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class FournisseurDTO {
    private int fournisseurId;
    private String Nom;
    private String Adresse;
    private String Numéro_de_téléphone;
    private String email;
    private String dateNaissance;
    private String genre;
    private String dateInscription;
    private String siteWeb;
    private String categorie;
    private String description;


    public Fournisseur toEntity() {
        return Fournisseur.builder()
                .siteWeb(siteWeb)
                .categorie(categorie)
                .description(description)
                .build();
    }
}