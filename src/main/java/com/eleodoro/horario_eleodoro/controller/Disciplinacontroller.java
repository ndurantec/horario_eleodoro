package com.eleodoro.horario_eleodoro.controller;

import java.net.URI;
import java.util.Optional;

import javax.sound.midi.Patch;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
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

import com.eleodoro.horario_eleodoro.dto.DisciplinaDto;
import com.eleodoro.horario_eleodoro.modelo.Disciplina;
import com.eleodoro.horario_eleodoro.repository.Disciplinarepository;
import com.eleodoro.horario_eleodoro.repository.Repositoryentity;

@RestController
//@CrossOrigin(origin = "http://127.0.0.1:8080")
@CrossOrigin("*")
@RequestMapping(value = "/disciplina")
public class Disciplinacontroller {


    private Disciplinarepository disciplinarepository;


    @GetMapping(value = "/imprimir")
    public void imprimir(){
        System.out.println("chegou ate aqui");
    }

    @PostMapping(value = "/insert")
    public ResponseEntity<Disciplina> insert(@RequestBody DisciplinaDto disciplinaDto){

        Disciplina novoDisciplina = disciplinaDto.novoDisciplina();
        disciplinarepository.save(novoDisciplina);

        System.out.println("Chegou no metodo insert");
        System.out.println(disciplinaDto.toString());
        
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("{/id}")
            .buildAndExpand(novoDisciplina.getId())
            .toUri();

        return ResponseEntity.created(uri).body(novoDisciplina);

        

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity <Disciplina> buscarPorid (@PathVariable Long Id){
    return Disciplinarepository.findByid(Id)
        .map(registro -> ResponseEntity.ok().body(registro))
        .orElse(ResponseEntity.notFound().build());
  }

  @PutMapping (value = "/{id}")
  public ResponseEntity <Disciplina> update (@PathVariable Long id, @RequestBody Disciplina disciplina){

     Optional<Disciplina> disciplinabanco = disciplinarepository.findByid(id);

     Disciplina disciplinamodificado = disciplinabanco.get();

    disciplinamodificado.setNome (disciplina.getNome());

    disciplinarepository.save (disciplinamodificado);
  
    return ResponseEntity.noContent().build();

}

}

