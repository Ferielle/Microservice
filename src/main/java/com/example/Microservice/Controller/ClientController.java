package com.example.Microservice.Controller;

import com.example.Microservice.Domain.DTO.ClientDTO;
import com.example.Microservice.Services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import java.util.List;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("client")
public class ClientController {
    @Autowired
    ClientService clientService;

    @GetMapping("/")
    public List<ClientDTO> getAllClients() {
        return clientService.getClients();
    }

    @PostMapping("/")
    public void createClient(@RequestBody ClientDTO client) {
        clientService.add(client);
    }
    @PutMapping("/{code}")
    public void updateClient(@PathVariable("id") int id, @RequestBody ClientDTO client) {
        clientService.update(id,client);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable("id") int id) {
        clientService.delete(id);
    }
}