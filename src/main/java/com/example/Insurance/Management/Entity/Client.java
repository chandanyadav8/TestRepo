package com.example.Insurance.Management.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;


@Entity
@Table(name="client")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private Date dob;
    private String address;
    private String contactInformation;
    @OneToMany(mappedBy = "client",cascade = CascadeType.ALL)
    private List<InsurancePolicy>insurancePolicyList;
}
