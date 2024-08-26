package com.eleodoro.horario_eleodoro.modelo;

import java.io.Serializable;
import java.time.DateTimeException;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GradeDeHorario implements Serializable {
    
    private LocalDateTime diaDaSemana;
    private int posicaoDaAula;
    private Turma turma;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Deprecated
    public GradeDeHorario() {
    }


    public GradeDeHorario(LocalDateTime diaDaSemana, int posicaoDaAula, Turma turma) {
        this.diaDaSemana = diaDaSemana;
        this.posicaoDaAula = posicaoDaAula;
        this.turma = turma;
    }


    public LocalDateTime getDiaDaSemana() {
        return diaDaSemana;
    }


    public void setDiaDaSemana(LocalDateTime diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }


    public int getPosicaoDaAula() {
        return posicaoDaAula;
    }


    public void setPosicaoDaAula(int posicaoDaAula) {
        this.posicaoDaAula = posicaoDaAula;
    }


    public Turma getTurma() {
        return turma;
    }


    public void setTurma(Turma turma) {
        this.turma = turma;
    }


    @Override
    public String toString() {
        return "GradeDeHorario [diaDaSemana=" + diaDaSemana + ", posicaoDaAula=" + posicaoDaAula + ", turma=" + turma
                + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((diaDaSemana == null) ? 0 : diaDaSemana.hashCode());
        result = prime * result + posicaoDaAula;
        result = prime * result + ((turma == null) ? 0 : turma.hashCode());
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
        GradeDeHorario other = (GradeDeHorario) obj;
        if (diaDaSemana == null) {
            if (other.diaDaSemana != null)
                return false;
        } else if (!diaDaSemana.equals(other.diaDaSemana))
            return false;
        if (posicaoDaAula != other.posicaoDaAula)
            return false;
        if (turma == null) {
            if (other.turma != null)
                return false;
        } else if (!turma.equals(other.turma))
            return false;
        return true;
    }

    public void conferirDuploProfessor(){

    }

    public void salvarGradeHorario(){

    }

    public void carregarGadeHorario(){

    }

    public void adicionarDisciplina(){

    }

    public void removerDisciplina(){

    }

    public void adicionarProfessor(){

    }

    public void removerProfessor(){

    }

    public void obterDisciplina(){

    }

    public void diaDeAulaSemana(){

    }

    public void periodosDeAula(){
        
    }
    
}
