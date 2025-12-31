package com.api.tfg.models;

import jakarta.persistence.*;

public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "user_id", referencedColumnName = "id", unique = true, nullable = false)
    private User user;

    @Column(name = "company_name", unique = true, nullable = false, length = 64)
    private String companyName;

    @Column(unique = true, nullable = false, length = 10)
    private String cif;

    @Column(nullable = false, length = 128)
    private String address;

    @Column(unique = true, nullable = false, length = 34)
    private String iban;
}
