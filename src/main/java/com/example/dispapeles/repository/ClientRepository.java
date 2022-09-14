package com.example.dispapeles.repository;
import com.example.dispapeles.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ClientRepository extends CrudRepository<Client, Integer>{

}
