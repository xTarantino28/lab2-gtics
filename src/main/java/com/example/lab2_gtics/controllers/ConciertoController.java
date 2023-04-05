package com.example.lab2_gtics.controllers;

import com.example.lab2_gtics.repository.ArtistasRepository;
import com.example.lab2_gtics.repository.ConciertoRepository;
import com.example.lab2_gtics.repository.IntegrantesRepository;
import com.example.lab2_gtics.entity.Artistas;
import com.example.lab2_gtics.entity.Concierto;
import com.example.lab2_gtics.entity.Integrantes;
import com.example.lab2_gtics.entity.Proveedores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
public class ConciertoController {

    @GetMapping(value = "")
    public String index(Model model){
        model.addAttribute("listaconciertos", ConciertoRepository.findAll());
        return "principal";
    }

    @GetMapping(value = "concierto/nuevo")
    public String nuevoConcierto(Model model){
        Concierto concierto = new Concierto();
        model.addAttribute("id", idconcierto);
        model.addAttribute("fecha", fecha_evento);
        model.addAttribute("listaproveedores", ProveedoresRepository.findAll());
        model.addAttribute("listaartistas", ArtistasRepository.findAll());
        return "nuevoConcierto";
    }
    @PostMapping(value = "concierto/guardar")
    public String guardarConcierto(Concierto concierto){
        conciertoRepository.save(concierto);
        return "redirect:/";
    }
}
