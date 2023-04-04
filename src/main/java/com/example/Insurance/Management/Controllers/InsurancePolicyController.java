package com.example.Insurance.Management.Controllers;

import com.example.Insurance.Management.Services.InsurancePolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/insurancePolicy")
public class InsurancePolicyController {
    @Autowired
    InsurancePolicyService insurancePolicyService;
    @PostMapping("/add")
    public String createInsurance(@RequestBody InsurancePolicyController insurancePolicy)
    {
        try {

            insurancePolicyService.createInsurance(insurancePolicy);
            return "Insurance added";
        }
        catch (Exception e)
        {
            return new Exception().toString();
        }

    }
}
