package com.eleodoro.horario_eleodoro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eleodoro.horario_eleodoro.controller.AgendaProfessorController;
import com.eleodoro.horario_eleodoro.modelo.AgendaProfessor;

public interface AgendaProfessorRepository extends JpaRepository<AgendaProfessor, Long>{

    void save(AgendaProfessorController agendaprofessorModificado);

    
}
