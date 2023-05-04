package com.carro.washcar.service;

import com.carro.washcar.model.ClientModel;
import com.carro.washcar.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public ClientModel registerNewClient(ClientModel clientModel) {
        return clientRepository.save(clientModel);
    }

    public List<ClientModel> fetchClients() {
        return clientRepository.findAll();
    }

    public Optional<ClientModel> fetchOnlyClient(Long identity) {
        return clientRepository.findById(identity);
    }

    public void deleteCliente(Long identity) {
        clientRepository.deleteById(identity);
    }
}
