package com.eleodoro.horario_eleodoro.controller;

import java.net.URI;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eleodoro.horario_eleodoro.dto.turmaDto;
import com.eleodoro.horario_eleodoro.modelo.Disciplina;
import com.eleodoro.horario_eleodoro.modelo.Turma;

@RestController
@RequestMapping(value = "/Turma")


public class TurmaController {

    @GetMapping(value = "imprimir")
    public void imprimir(){
        System.out.println("chegou ate aqui");
    }
    
    @PostMapping(value = "/turma")
    public voud insert(@RequestBody turmaDto turmaDto){

        System.out.println("Chegou no metodo insert");
        System.out.println(TurmaDto.toString());

        URI uri = ServletComponentBuilder.fromCurrentRequest()

        .path("{/id}")
            .buildAndExpand(novaTurma.getId())
            .toUri();

        return ResponseEntity.created(uri).body(novaTurma);

       
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity <Turma> buscarPorid (@PathVariable Long Id){
    return Disciplinarepository.findByid(Id)
        .map(registro -> ResponseEntity.ok().body(registro))
        .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity <TUrma> update (@PathVariable Long id, @RequestBody Turma Turma){
  
       Optional<Turma> TurmaBanco = TurmaRepository.findByid(id);
  
       Turma TurmaModificado = TurmaBanco.get();
  
      TurmaModificado.setNome (disciplina.getNome());
  
      TurmaRepository.save (TurmaModificado);
    
      return ResponseEntity.noContent().build();
  
  }
}
