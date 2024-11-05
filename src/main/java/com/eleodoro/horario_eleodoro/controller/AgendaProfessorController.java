package com.eleodoro.horario_eleodoro.controller;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.eleodoro.horario_eleodoro.dto.AgendaProfessorDto;
import com.eleodoro.horario_eleodoro.modelo.AgendaProfessor;
import com.eleodoro.horario_eleodoro.repository.AgendaProfessorRepository;

@RestController
@CrossOrigin
@RequestMapping(value = "/agendaprofessor")
public class AgendaProfessorController{

    @Autowired
    private AgendaProfessorRepository agendaprofessorRepository;



    @GetMapping(value = "/imprimir")
    public String imprimir(){
        return "chegou ate aqui AgendaProfessor";
    }


    @PostMapping(value = "/insert")
    public ResponseEntity<AgendaProfessorController> insert(@RequestBody AgendaProfessorDto agendaprofessorDto){

        AgendaProfessorController novoAgendaProfessor = agendaprofessorDto.novoAgendaProfessor();
        agendaprofessorRepository.save(novoAgendaProfessor);

        System.out.println("Chegou no método insert");
        System.out.println(agendaprofessorDto.toString());

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
        .path("{/id}")
        .buildAndExpand(AgendaProfessor.getId())
        .toUri();

        return ResponseEntity.created(uri).body(novoAgendaProfessor);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity <AgendaProfessorController> buscarPorId(@PathVariable Long Id){
        return (ResponseEntity<AgendaProfessorController>) AgendaProfessor.findById(Id)
        .map(registro -> ResponseEntity.ok().body(registro))
        .orElse(ResponseEntity.notFound().build());
        
    }

    @PutMapping(value = "/{id}")
public ResponseEntity<AgendaProfessorController> update(@PathVariable Long id, @RequestBody AgendaProfessorController agendaprofessor) {
    
    Optional<AgendaProfessorController> agendaprofessorBanco = AgendaProfessor.findById(id);

    AgendaProfessorController agendaprofessorModificado = agendaprofessorBanco.get();

    agendaprofessorModificado.setAgendaProfessor(agendaprofessor.getAgendaProfessor());

    agendaprofessorRepository.save(agendaprofessorModificado);

    return ResponseEntity.noContent().build();
}

private void setAgendaProfessor(Object agendaProfessor) {
      
        throw new UnsupportedOperationException("Unimplemented method 'setAgendaProfessor'");
    }

private Object getAgendaProfessor() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getAgendaProfessor'");
    }

@DeleteMapping(value = "/{id}")
public ResponseEntity<AgendaProfessor> delete(@PathVariable Long id){
    if(agendaprofessorRepository.existsById(id)){
       agendaprofessorRepository.deleteById(id);
       return ResponseEntity.noContent().build();
    }
    return ResponseEntity.notFound().build();
}
}