package com.training360.bootbank;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ClientController {

    private ClientRepository clientRepository;

    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @RequestMapping("/")
    public List<Client> listClients() {
        //return Arrays.asList(new Client("Jani"), new Client("Mari"));
        List<Client> clients = new ArrayList<>();
        clientRepository.findAll().forEach(c -> clients.add(c));
        return clients;
    }
}
