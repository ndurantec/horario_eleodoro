package com.eleodoro.horario_eleodoro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/AgendaProfessor")
public class AgendaProfessor{

    @GetMapping(value = "imprimir")
    public void imprimir(){
        System.out.println("chegou ate aqui");
    }
}