package com.eleodoro.horario_eleodoro.controller;


import java.net.URI;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.eleodoro.horario_eleodoro.controller.repository.GradeDeHorarioRepository;
import com.eleodoro.horario_eleodoro.dto.GradeDeHorarioDto;
import com.eleodoro.horario_eleodoro.modelo.GradeDeHorario;

@RestController
@RequestMapping(value = "/gradedehorario")
public class GradeDeHorarioController {


    @GetMapping(value = "/imprimir")
    public void imprimir(){
        System.out.println("chegou até aqui");
    }

    private GradeDeHorarioRepository gradedehorarioRepository;

    @PostMapping(value = "/insert")
    public ResponseEntity<GradeDeHorario> insert(@RequestBody GradeDeHorarioDto gradeDeHorarioDto){

        GradeDeHorario novoGradeDeHorario = gradeDeHorarioDto.novoGradeDeHorario();
        gradedehorarioRepository.save(novoGradeDeHorario);

        System.out.println("Chegou no método insert");
        System.out.println(gradeDeHorarioDto.toString());

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
        .path("{/id}")
        .buildAndExpand(novoGradeDeHorario.getId())
        .toUri();

        return ResponseEntity.created(uri).body(novoGradeDeHorario);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity <GradeDeHorario> buscarPorId(@PathVariable Long Id){
        return (ResponseEntity<GradeDeHorario>) gradedehorarioRepository.findById(Id)
        .map(registro -> ResponseEntity.ok().body(registro))
        .orElse(ResponseEntity.notFound().build());
        
    }

    @PutMapping(value = "/{id}")
public ResponseEntity<GradeDeHorario> update(@PathVariable Long id, @RequestBody GradeDeHorario gradedehorario) {
    
    Optional<GradeDeHorario> gradedehorarioBanco = gradedehorarioRepository.findById(id);

    GradeDeHorario gradedehorarioModificado = gradedehorarioBanco.get();

    gradedehorarioModificado.setTurma(gradedehorario.getTurma());

    gradedehorarioRepository.save(gradedehorarioModificado);

    return ResponseEntity.noContent().build();
}
}