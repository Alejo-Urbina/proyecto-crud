package com.example.dispapeles.controller;

import com.example.dispapeles.model.Client;
import com.example.dispapeles.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping()
    public Client save(@RequestBody Client client){
        return clientService.save(client);
    }

    @GetMapping()
    public List<Client> clients(){
        return clientService.getAll();
    }

    @GetMapping("/{id}")
    public Client getId(@PathVariable Integer id){
        return clientService.getId(id);
    }

    @PutMapping("/{id}")
    public Client setClient(@RequestBody Client client, @PathVariable Integer id){

        Client clientCurrent = clientService.getId(id);

        clientCurrent.setTypeDocument(client.getTypeDocument());
        clientCurrent.setName(client.getName());
        clientCurrent.setLastName(client.getLastName());
        clientCurrent.setAgo(client.getAgo());
        clientCurrent.setPhone(client.getPhone());
        clientCurrent.setAddress(client.getAddress());

        return clientService.save(clientCurrent);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        clientService.delete(id);
    }

}
