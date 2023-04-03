package com.example.Insurance.Management.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;


@Entity
@Table(name="claim")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private int id;
    private int claimNumber;
    private String description;
    private Date claimDate;
    private String claimStatus;

    @OneToMany(mappedBy = "claim",cascade = CascadeType.ALL)
    private List<InsurancePolicy>insurancePolicyListclaim;



}
