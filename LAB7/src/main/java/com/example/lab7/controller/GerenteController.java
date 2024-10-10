package com.example.lab7.controller;

import com.example.lab7.entity.Pelicula;
import com.example.lab7.entity.Usuario;
import com.example.lab7.repository.PeliculaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/gerente")
public class GerenteController {

    final PeliculaRepository peliculaRepository;

    public GerenteController(PeliculaRepository peliculaRepository){
        this.peliculaRepository= peliculaRepository;
    }

    @GetMapping(value={"","/"})
    public String listaProyecciones(Model model){
        model.addAttribute("listaProyecciones", peliculaRepository.findAll());
        return "gerente/proyecciones";
    }

    @GetMapping("/nuevo")
    public String nuevaProyeccion(Model model, @ModelAttribute("proyeccion") Pelicula proyeccion) {

        return "gerente/formulario";
    }


}
