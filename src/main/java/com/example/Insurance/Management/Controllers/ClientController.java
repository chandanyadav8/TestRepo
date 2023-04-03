package com.example.Insurance.Management.Controllers;

import com.example.Insurance.Management.Entity.Client;
import com.example.Insurance.Management.Services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
