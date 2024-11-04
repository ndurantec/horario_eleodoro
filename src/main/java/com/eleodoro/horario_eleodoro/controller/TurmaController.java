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

import com.eleodoro.horario_eleodoro.dto.TurmaDto;
import com.eleodoro.horario_eleodoro.modelo.Turma;
import com.eleodoro.horario_eleodoro.repository.TurmaRepository;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/turma")
public class TurmaController {

    @Autowired
    private TurmaRepository turmaRepository;

    @GetMapping(value = "/imprimir")
    public void imprimir() {
        System.out.println("Chegou até aqui");
    }

    @PostMapping(value = "/insert")
    public ResponseEntity<Turma> insert(@RequestBody TurmaDto turmaDto) {
        Turma novaTurma = turmaDto.novoTurma();
        turmaRepository.save(novaTurma);

        System.out.println("Chegou no método insert");
        System.out.println(turmaDto.toString());
        
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(novaTurma.getId())
            .toUri();

        return ResponseEntity.created(uri).body(novaTurma);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Turma> buscarPorId(@PathVariable Long id) {
        Optional<Turma> turma = turmaRepository.findById(id);
        return turma.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Turma> update(@PathVariable Long id, @RequestBody TurmaDto turmaDto) {
        Optional<Turma> turmaBanco = turmaRepository.findById(id);
        
        if (turmaBanco.isPresent()) {
            Turma turmaModificada = turmaBanco.get();
            turmaModificada.setNome(turmaDto.getNome()); 
            
            turmaRepository.save(turmaModificada);
            return ResponseEntity.ok(turmaModificada);
        }
        
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (turmaRepository.existsById(id)) {
            turmaRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}