package com.eleodoro.horario_eleodoro.dto;

import com.eleodoro.horario_eleodoro.modelo.Turma;

public class TurmaDto {
    

    private String nome;
    private String sala;
    
    public TurmaDto() {
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

    public static Turma novoTurma() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'novoTurma'");
    }

    
}
