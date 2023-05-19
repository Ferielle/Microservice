package com.example.Microservice.Controller;

import com.example.Microservice.Domain.DTO.FournisseurDTO;
import com.example.Microservice.Services.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("fournisseur")
public class FournisseurController {
    @Autowired
    FournisseurService fournisseurService;

    @GetMapping("/")
    public List<FournisseurDTO> getAllFournisseur() {
        return fournisseurService.getFournisseurs();
    }

    @PostMapping("/")
    public void createFournisseur(@RequestBody FournisseurDTO fournisseur) {
        fournisseurService.add(fournisseur);
    }
    @PutMapping("/{id}")
    public void updateFournisseur(@PathVariable("id") int id, @RequestBody FournisseurDTO fournisseur) {
        fournisseurService.update(id,fournisseur);
    }

    @DeleteMapping("/{id}")
    public void deleteFournisseur(@PathVariable("id") int id) {
        fournisseurService.delete(id);
    }
}