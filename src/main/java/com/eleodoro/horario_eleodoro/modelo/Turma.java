package com.eleodoro.horario_eleodoro.modelo;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Turma implements Serializable {
    
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sala;


    @Deprecated
    public Turma() {
    }


    public Turma(String nome, String sala) {
        this.nome = nome;
        this.sala = sala;
    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
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

    public void criarTurma(){

    }

    public void removerTurma(){
        
    }

    @Override
    public String toString() {
        return "Turma [nome=" + nome + ", sala=" + sala + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((sala == null) ? 0 : sala.hashCode());
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
        Turma other = (Turma) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (sala == null) {
            if (other.sala != null)
                return false;
        } else if (!sala.equals(other.sala))
            return false;
        return true;
    }
       
}

