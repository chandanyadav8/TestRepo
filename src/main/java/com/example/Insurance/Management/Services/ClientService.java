package com.example.Insurance.Management.Services;

import com.example.Insurance.Management.Entity.Client;
import com.example.Insurance.Management.Repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;
    public void createClient(Client client) throws Exception
    {
        clientRepository.save(client);
    }
    public List<Client> getAllClient(){
        return clientRepository.findAll();
    }
    public Client getClientById(int id){
        return clientRepository.findById(id).get();
    }
    public String updateClient(Client client)
    {
        if(client.getId()==0)
        {
            return "Id not provided";
        }
        clientRepository.save(client);
        return "Client updated succesfully";
    }
    public String deleteClient(int id)
    {
        clientRepository.deleteById(id);
        return "Client delted succesfully";
    }
}
