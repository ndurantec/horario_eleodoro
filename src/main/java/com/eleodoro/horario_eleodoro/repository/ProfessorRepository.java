package com.eleodoro.horario_eleodoro.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eleodoro.horario_eleodoro.modelo.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long>{
    
    
}
