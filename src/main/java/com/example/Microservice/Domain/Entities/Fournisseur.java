package com.example.Microservice.Domain.Entities;
import com.example.Microservice.Domain.DTO.FournisseurDTO;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@EqualsAndHashCode(callSuper = false)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Fournisseur extends Personne implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fournisseurId;

    
    private String siteWeb;
    private String categorie;
    private String description;
@Builder
    public Fournisseur( String Nom, String Adresse, String Numéro_de_téléphone, String email, String dateNaissance, String genre, String dateInscription, int fournisseurId, String siteWeb, String categorie, String description) {
    super( Nom, Adresse, Numéro_de_téléphone, email, dateNaissance, genre, dateInscription);

        this.fournisseurId = fournisseurId;
        this.siteWeb = siteWeb;
        this.categorie = categorie;
        this.description = description;
    }
    public FournisseurDTO toDto(){
        return FournisseurDTO.builder().Nom(getNom())
                .Adresse(getAdresse()).Numéro_de_téléphone(getNuméro_de_téléphone())
                .email(getEmail())
                .dateNaissance(getDateNaissance())
                .siteWeb(getSiteWeb())
                .categorie(getCategorie())
                .description(getDescription())

                
                .build();
    }
}