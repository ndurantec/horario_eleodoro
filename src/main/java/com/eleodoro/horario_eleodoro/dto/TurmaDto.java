package com.eleodoro.horario_eleodoro.dto;

import com.eleodoro.horario_eleodoro.modelo.Turma;

public class TurmaDto{

    private int id;
    private String nome;
    private String sala;
    
    public void TurmaDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Turma novoTurma() {
        return new Turma(nome, sala);        
    }
   
}
