package com.eleodoro.horario_eleodoro.dto;

public class Diciplinadto {
 
    private Spring nome;
    private int cargaHoraria;
    private Professor professor;
    public Diciplinadto() {
    }
    public Spring getNome() {
        return nome;
    }
    public void setNome(Spring nome) {
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
