package com.example.Insurance.Management.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@Table(name="InsurancePolicy")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsurancePolicy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    private int policyNumber;
    private String type;
    private int coverageAmount;
    private boolean premium;
    private Date startDate;
    private Date endDate;
    @JoinColumn
    @ManyToOne
    private Client client;
    @JoinColumn
    @ManyToOne
    private Claim claim;


//    policy
//    number, type, coverage amount, premium, start date, and end date
}
