package com.example.Microservice.Services;


import com.example.Microservice.Domain.DTO.FournisseurDTO;
import com.example.Microservice.Domain.Entities.Fournisseur;
import com.example.Microservice.Repository.FournisseurRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class fournisseurServiceImpl implements FournisseurService{

    @Autowired
    FournisseurRepository fournisseurRepository;
    @Override
    public void add(FournisseurDTO fournisseurDTO) {
        fournisseurRepository.save(fournisseurDTO.toEntity());
    }

    @Override
    public void update(int id, FournisseurDTO fournisseurDTO) {
        Fournisseur fournisseur = fournisseurRepository.findFournisseurByFournisseurId(fournisseurDTO.getFournisseurId());
        if (fournisseur ==null) {
            return;
        }
        fournisseur = fournisseurDTO.toEntity();
        fournisseurRepository.save(fournisseur);
    }

    @Override
    public void delete(int id) {
        Fournisseur fournisseur;
        fournisseur = fournisseurRepository.findFournisseurByFournisseurId(id);
        fournisseurRepository.delete(fournisseur);
    }

    @Override
    public List<FournisseurDTO> getFournisseurs() {
        return fournisseurRepository.findAll().stream().map(e-> e.toDto()).collect(Collectors.toList());
    }
}
