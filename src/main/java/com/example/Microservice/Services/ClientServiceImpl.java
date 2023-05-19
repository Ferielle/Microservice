package com.example.Microservice.Services;



import com.example.Microservice.Domain.DTO.ClientDTO;
import com.example.Microservice.Domain.Entities.Client;
import com.example.Microservice.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    ClientRepository clientRepository;

    @Override
    public void add(ClientDTO clientDTO) {
        clientRepository.save(clientDTO.toEntity());
    }

    @Override
    public void update(int id, ClientDTO clientDTO) {
        Client client = clientRepository.findClientById(clientDTO.getId());
        if (client ==null) {
            return;
        }
        client = clientDTO.toEntity();
        clientRepository.save(client);
    }



    @Override
    public void delete(int id) {
        Client client;
        client = clientRepository.findClientById(id);
        clientRepository.delete(client);
    }

    @Override
    public List<ClientDTO> getClients() {
        return clientRepository.findAll().stream().map(e-> e.toDto()).collect(Collectors.toList());
    }


}