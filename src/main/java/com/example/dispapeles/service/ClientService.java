package com.example.dispapeles.service;

import com.example.dispapeles.model.Client;

import java.util.List;

public interface ClientService {

    public Client save(Client client);

    public void delete(Integer id);

    public Client getId(Integer id);

    public List<Client> getAll();

}
