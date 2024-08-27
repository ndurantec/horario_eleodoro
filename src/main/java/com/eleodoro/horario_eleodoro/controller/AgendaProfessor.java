package com.eleodoro.horario_eleodoro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/agendaprofessor")
public class AgendaProfessor{

    @GetMapping(value = "/imprimir")
    public String imprimir(){
        return "chegou ate aqui AgendaProfessor";
    }
}