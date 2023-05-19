package com.example.Microservice.Domain.Entities;

import com.example.Microservice.Domain.DTO.ClientDTO;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Client extends Personne implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nationalite;
    private String statutCompte;
    private String historiqueAchats;
    private String informationsPaiement;

@Builder
    public Client(int id, String Nom, String Adresse, String Numéro_de_téléphone, String email, String dateNaissance, String genre, String dateInscription,  String nationalite, String statutCompte, String historiqueAchats, String informationsPaiement) {
        super( Nom, Adresse, Numéro_de_téléphone, email, dateNaissance, genre, dateInscription);
        this.id = id;
        this.nationalite = nationalite;
        this.statutCompte = statutCompte;
        this.historiqueAchats = historiqueAchats;
        this.informationsPaiement = informationsPaiement;

    }
    public ClientDTO toDto(){
        return ClientDTO.builder().Nom(getNom())
                .Adresse(getAdresse()).Numéro_de_téléphone(getNuméro_de_téléphone())
                .email(getEmail())
                .dateNaissance(getDateNaissance())
                .nationalite(getNationalite())
                .statutCompte(getStatutCompte())
                .historiqueAchats(getHistoriqueAchats())
                .informationsPaiement(getInformationsPaiement())
                .dateInscription(getDateInscription())
                .build();
    }

}
