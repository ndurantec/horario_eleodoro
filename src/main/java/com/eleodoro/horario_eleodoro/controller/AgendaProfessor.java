package com.eleodoro.horario_eleodoro.controller;

import java.net.URI;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
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
@RequestMapping(value = "/agendaprofessor")
public class AgendaProfessor{

    @GetMapping(value = "/imprimir")
    public String imprimir(){
        return "chegou ate aqui AgendaProfessor";
    }

    private AgendaProfessorRepository agendaprofessorRepository;

    @PostMapping(value = "/insert")
    public ResponseEntity<AgendaProfessor> insert(@RequestBody AgendaProfessorDto agendaprofessorDto){

        AgendaProfessor novoAgendaProfessor = agendaProfessorDto.novoGradeDeHorario();
        agendaprofessorRepository.save(novoAgendaProfessor);

        System.out.println("Chegou no método insert");
        System.out.println(agendaProfessorDto.toString());

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
        .path("{/id}")
        .buildAndExpand(agendaProfesor.getId())
        .toUri();

        return ResponseEntity.created(uri).body(novoAgendaProfessor);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity <AgendaProfessor> buscarPorId(@PathVariable Long Id){
        return (ResponseEntity<AgendaProfessor>) agendaprofessorRepository.findById(Id)
        .map(registro -> ResponseEntity.ok().body(registro))
        .orElse(ResponseEntity.notFound().build());
        
    }

    @PutMapping(value = "/{id}")
public ResponseEntity<AgendaProfessor> update(@PathVariable Long id, @RequestBody AgendaProfessor agendaprofessor) {
    
    Optional<AgendaProfessor> agendaprofessorBanco = agendaprofessorRepository.findById(id);

    AgendaProfessor agendaprofessorModificado = agendaprofessorBanco.get();

    agendaprofessorModificado.setTurma(agendaprofessor.getDisciplina());

    agendaprofessorRepository.save(agendaprofessorModificado);

    return ResponseEntity.noContent().build();
}
}