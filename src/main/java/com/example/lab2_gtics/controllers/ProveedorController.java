package com.example.lab2_gtics.controllers;


import com.example.lab2_gtics.entity.Proveedores;
import com.example.lab2_gtics.repository.ProveedoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProveedorController {

    final ProveedoresRepository proveedoresRepository;
    public ProveedorController (ProveedoresRepository proveedoresRepository) {
        this.proveedoresRepository = proveedoresRepository;
    }

    @GetMapping("/proveedores/lista")
    public String mostrarListaProveedores(Model model) {
        List<Proveedores> listaProveedores = proveedoresRepository.findAll();
        model.addAttribute("listaProveedores",listaProveedores);
        return "proveedores/lista";
    }





}
