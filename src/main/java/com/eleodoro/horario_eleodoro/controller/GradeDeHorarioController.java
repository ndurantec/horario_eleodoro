package com.eleodoro.horario_eleodoro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/GradeDeHorario")
public class GradeDeHorarioController {

    @GetMapping(value = "imprimir")
    public void imprimir(){
        System.out.println("chegou até aqui");
    }
}
