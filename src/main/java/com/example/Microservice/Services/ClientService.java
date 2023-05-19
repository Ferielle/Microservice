package com.example.Microservice.Services;


import com.example.Microservice.Domain.DTO.ClientDTO;

import java.util.List;

public interface ClientService {
    void add(ClientDTO clientDTO);
    void update(int id,ClientDTO clientDTO);
    void delete (int id );
    List<ClientDTO> getClients();
}
