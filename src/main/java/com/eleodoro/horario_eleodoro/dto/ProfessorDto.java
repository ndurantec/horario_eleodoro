package com.eleodoro.horario_eleodoro.dto;

import com.eleodoro.horario_eleodoro.modelo.Professor;

public class ProfessorDto {
    
    private String nome;
    private String cpf;
    
    public ProfessorDto() {
    }
   
    public ProfessorDto(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Professor novoProfessor() {
        return new Professor(nome, cpf);
    }

}
