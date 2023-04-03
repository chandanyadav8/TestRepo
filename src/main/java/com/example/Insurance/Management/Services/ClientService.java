package com.example.Insurance.Management.Services;

import com.example.Insurance.Management.Entity.Client;
import com.example.Insurance.Management.Repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;
    public void createClient(Client client) throws Exception
    {
        clientRepository.save(client);
    }
}
