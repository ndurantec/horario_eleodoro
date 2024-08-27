package com.eleodoro.horario_eleodoro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/professor")
public class ProfessorController {
    
    @GetMapping(value = "/imprimir")
    public String imprimir(){
        return "chegou ate aqui ProfessorController";
    }

}
