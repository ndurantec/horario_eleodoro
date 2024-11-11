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

import com.eleodoro.horario_eleodoro.dto.ProfessorDto;
import com.eleodoro.horario_eleodoro.modelo.Professor;
import com.eleodoro.horario_eleodoro.repository.ProfessorRepository;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/professor")
public class ProfessorController {

    @Autowired
    private ProfessorRepository professorRepository;

    @GetMapping(value = "/imprimir")
    public void imprimir() {
        System.out.println("chegou ate aqui");
    }

    @PostMapping(value = "/insert")
    public ResponseEntity<Professor> insert(@RequestBody ProfessorDto professorDto) {
        Professor novoProfessor = professorDto.novoProfessor();
        professorRepository.save(novoProfessor);

        System.out.println("Chegou no metodo insert");
        System.out.println(professorDto.toString());
        
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(novoProfessor.getId())
            .toUri();

        return ResponseEntity.created(uri).body(novoProfessor);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Professor> buscarPorId(@PathVariable Long id) {
        return professorRepository.findById(id)
            .map(registro -> ResponseEntity.ok().body(registro))
            .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Professor> update(@PathVariable Long id, @RequestBody Professor professor) {
        Optional<Professor> professorBanco = professorRepository.findById(id);

        if (!professorBanco.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        Professor professorModificado = professorBanco.get();
        professorModificado.setNome(professor.getNome());

        professorRepository.save(professorModificado);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (professorRepository.existsById(id)) {
            professorRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}