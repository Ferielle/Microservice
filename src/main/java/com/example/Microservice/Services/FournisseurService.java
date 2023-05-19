package com.example.Microservice.Services;



import com.example.Microservice.Domain.DTO.FournisseurDTO;

import java.util.List;

public interface FournisseurService {
    void add(FournisseurDTO fournisseurDTO);
    void update(int id,FournisseurDTO fournisseurDTO);
    void delete (int id );
    List<FournisseurDTO> getFournisseurs();
}
