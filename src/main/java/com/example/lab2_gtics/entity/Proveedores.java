package com.example.lab2_gtics.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name ="proveedores")
public class Proveedores {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idproveedores",nullable = false)
    private Integer idproveedores;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "telefono")
    private int telefono;

    @Column(name = "elemento")
    private String elemento;


}
