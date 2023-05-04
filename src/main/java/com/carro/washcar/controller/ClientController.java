package com.carro.washcar.controller;

import com.carro.washcar.model.ClientModel;
import com.carro.washcar.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping(path = "/cliente")
    public ClientModel registerClient (@RequestBody ClientModel clientModel){
        return clientService.registerNewClient(clientModel);
    }

    @GetMapping(path = "/cliente")
    public List<ClientModel> queryAllCliente(){
        return clientService.fetchClients();
    }

    @GetMapping(path = {"id"})
    public Optional<ClientModel> queryOnlyCliente(@PathVariable Long id){
        return clientService.fetchOnlyClient(id);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteCliente(@PathVariable Long identity){
        clientService.deleteCliente(identity);

    }



}
