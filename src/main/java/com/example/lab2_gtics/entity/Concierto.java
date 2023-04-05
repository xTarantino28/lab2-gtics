package com.example.lab2_gtics.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name ="concierto")
public class Concierto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idconcierto",nullable = false)
    private Integer idconcierto;

    @Column(name = "nombre_grupo")
    private String fecha_evento;

    @Column(name = "proveedores_idproveedores")
    private int proveedores_idproveedores;


    @Column(name = "artistas_idartistas")
    private String artistas_idartistas;

}
