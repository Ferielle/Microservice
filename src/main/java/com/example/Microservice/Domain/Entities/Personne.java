package com.example.Microservice.Domain.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personne implements Serializable {


    private String Nom;
    private String Adresse;
    private String Numéro_de_téléphone;
    private String email;
    private String dateNaissance;
    private String genre;
    private String dateInscription;



}