package com.example.Insurance.Management.Controllers;

import com.example.Insurance.Management.Entity.Client;
import com.example.Insurance.Management.Services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.ref.Cleaner;
import java.security.PublicKey;
import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    ClientService clientService;
    @PostMapping("/add")
    public String createClient(@RequestBody Client client)
    {
        try {

            clientService.createClient(client);
            return "client created";
        }
        catch (Exception e)
        {
            return new Exception().toString();
        }

    }
    @GetMapping("/getAllClient")
    public List<Client>getAllClient()
    {
        List<Client>clientList=clientService.getAllClient();
        return clientList;

    }
    @GetMapping("/getClientById/{id}")
    public Client getClientById(@PathVariable("id")int id )
    {
        Client client=clientService.getClientById(id);
        return client;

    }
    @PutMapping("/updateClient")
    public String updateClient(@RequestBody Client client)
    {
       return clientService.updateClient(client);

    }
    @DeleteMapping("/deleteClient/{id}")
    public String deleteClient(@PathVariable("id") int id)
    {
        return clientService.deleteClient(id);
    }
}
