package com.eleodoro.horario_eleodoro.controller;

import java.net.URI;
import java.util.Optional;

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

import com.eleodoro.horario_eleodoro.dto.professorDto;
import com.eleodoro.horario_eleodoro.dto.Professor;
import com.eleodoro.horario_eleodoro.repository.Professorrepository;

@RestController
//@CrossOrigin(origin = "http://127.0.0.1:8080")
@CrossOrigin("*")
@RequestMapping(value = "/professor")
public class ProfessorController {


    private Professorrepository professorrepository;


    @GetMapping(value = "/imprimir")
    public void imprimir(){
        System.out.println("chegou ate aqui");
    }

    @PostMapping(value = "/insert")
    public ResponseEntity<Professor> insert(@RequestBody professorDto professorDto){

        Professor novoProfessor = professorDto.novoProfessor();
        Professorrepository.save(novoProfessor);

        System.out.println("Chegou no metodo insert");
        System.out.println(professorDto.toString());
        
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("{/id}")
            .buildAndExpand(novoProfessor.getId())
            .toUri();

        return ResponseEntity.created(uri).body(novoProfessor);

        

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity <Professor> buscarPorid (@PathVariable Long Id){
    return Professorrepository.findByid(Id)
        .map(registro -> ResponseEntity.ok().body(registro))
        .orElse(ResponseEntity.notFound().build());
  }

  @PutMapping (value = "/{id}")
  public ResponseEntity <Professor> update (@PathVariable Long id, @RequestBody Professor professor){

     Optional<Professor> professorbanco = Professorrepository.findByid(id);

     Professor professormodificado = professorbanco.get();

    professormodificado.setNome (professor.getNome());

    Professorrepository.save (professormodificado);
  
    return ResponseEntity.noContent().build();

}

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (professorrepository.existsById(id)) {
            professorrepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } 
        return ResponseEntity.notFound().build();       
        }

}

