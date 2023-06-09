package com.example.lab2_gtics.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name ="integrantes")
public class Integrantes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idintegrantes",nullable = false)
    private Integer idintegrantes;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "edad")
    private int edad;

    @Column(name = "anhios_exp")
    private Integer anhios_exp;

    @Column(name = "rol")
    private String rol;

    @Column(name = "artistas_idartistas")
    private int artistas_idartistas;
}
