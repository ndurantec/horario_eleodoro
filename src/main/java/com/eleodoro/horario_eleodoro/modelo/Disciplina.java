package com.eleodoro.horario_eleodoro.modelo;

import javax.swing.Spring;

public class Disciplina {

    private Spring nome;
    private int cargaHoraria;
    private Professor professor;


    public Disciplina() {
    }
    public Disciplina(Spring nome, int cargaHoraria, Professor professor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
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
    @Override
    public String toString() {
        return "Disciplina [nome=" + nome + ", cargaHoraria=" + cargaHoraria + ", professor=" + professor + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + cargaHoraria;
        result = prime * result + ((professor == null) ? 0 : professor.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Disciplina other = (Disciplina) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (cargaHoraria != other.cargaHoraria)
            return false;
        if (professor == null) {
            if (other.professor != null)
                return false;
        } else if (!professor.equals(other.professor))
            return false;
        return true;
    }
    
    public void definirNome( ){

    }

    public void definirCargaHoraria( ){
        
    }

    public void inserirProfessor( ){
        
    }

    public void verificarProfessor( ){
        
    }

    public void removerProfessor( ){
        
    }

}
