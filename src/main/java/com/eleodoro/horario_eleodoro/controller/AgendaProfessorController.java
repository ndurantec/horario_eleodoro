package com.eleodoro.horario_eleodoro.controller;

import java.net.URI;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin
@RequestMapping(value = "/agendaprofessor")
public class AgendaProfessorController{

    @GetMapping(value = "/imprimir")
    public String imprimir(){
        return "chegou ate aqui AgendaProfessor";
    }

    private AgendaProfessorRepository agendaprofessorRepository;

    @PostMapping(value = "/insert")
    public ResponseEntity<AgendaProfessorController> insert(@RequestBody AgendaProfessorDto agendaprofessorDto){

        AgendaProfessorController novoAgendaProfessor = agendaProfessorDto.novoGradeDeHorario();
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
    public ResponseEntity <AgendaProfessorController> buscarPorId(@PathVariable Long Id){
        return (ResponseEntity<AgendaProfessorController>) agendaprofessorRepository.findById(Id)
        .map(registro -> ResponseEntity.ok().body(registro))
        .orElse(ResponseEntity.notFound().build());
        
    }

    @PutMapping(value = "/{id}")
public ResponseEntity<AgendaProfessorController> update(@PathVariable Long id, @RequestBody AgendaProfessorController agendaprofessor) {
    
    Optional<AgendaProfessorController> agendaprofessorBanco = agendaprofessorRepository.findById(id);

    AgendaProfessorController agendaprofessorModificado = agendaprofessorBanco.get();

    agendaprofessorModificado.setTurma(agendaprofessor.getDisciplina());

    agendaprofessorRepository.save(agendaprofessorModificado);

    return ResponseEntity.noContent().build();
}
}