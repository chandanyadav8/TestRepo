package com.example.Insurance.Management.Services;

import com.example.Insurance.Management.Controllers.InsurancePolicyController;
import com.example.Insurance.Management.Repositories.InsurancePolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsurancePolicyService {
    @Autowired
    InsurancePolicyRepository insurancePolicyRepository;
    public String createInsurance(InsurancePolicyController insurancePolicy)
    {
        insurancePolicyRepository.save(insurancePolicy);
        return "added insurancePolicy";
    }
}
