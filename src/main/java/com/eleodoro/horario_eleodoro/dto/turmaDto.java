package com.eleodoro.horario_eleodoro.dto;

import com.eleodoro.horario_eleodoro.modelo.Turma;

public class turmaDto {
    

    private String nome;
    private String sala;
    
    public turmaDto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Turma novaTurma() {
        return null;
    }

    
}
