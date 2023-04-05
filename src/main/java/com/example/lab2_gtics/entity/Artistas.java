package com.example.lab2_gtics.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name ="artistas")
public class Artistas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idartistas",nullable = false)
    private Integer idartistas;

    @Column(name = "nombre_grupo")
    private String nombre_grupo;

    @Column(name = "fecha_creacion")
    private Date fecha_creacion;


    @Column(name = "tipo_musica")
    private String tipo_musica;

}
