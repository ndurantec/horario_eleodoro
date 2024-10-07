package com.eleodoro.horario_eleodoro.dto;

public class professorDto {
    
    private String nome;
    private String cpf;
    
    public professorDto() {
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
        return null;
    }

}
