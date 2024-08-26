package com.eleodoro.horario_eleodoro.dto;

import com.eleodoro.horario_eleodoro.modelo.Professor;

public class DiciplinaDto {
 
    private String nome;
    private int cargaHoraria;
    private Professor professor;
    public DiciplinaDto() {
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    

}
