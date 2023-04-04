package com.example.Insurance.Management.Repositories;

import com.example.Insurance.Management.Controllers.InsurancePolicyController;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsurancePolicyRepository extends JpaRepository<InsurancePolicyController,Integer> {
}
