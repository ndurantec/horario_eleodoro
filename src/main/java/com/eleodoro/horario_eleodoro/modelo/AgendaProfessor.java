package com.eleodoro.horario_eleodoro.modelo;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AgendaProfessor implements Serializable {
    
    private int aulaPorDia;
    private String horario;
    private Turma turma;
    private Disciplina disciplina;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Deprecated
    public AgendaProfessor() {
    }


    public AgendaProfessor(int aulaPorDia, String horario, Turma turma, Disciplina disciplina) {
        this.aulaPorDia = aulaPorDia;
        this.horario = horario;
        this.turma = turma;
        this.disciplina = disciplina;
    }


    public int getAulaPorDia() {
        return aulaPorDia;
    }


    public void setAulaPorDia(int aulaPorDia) {
        this.aulaPorDia = aulaPorDia;
    }


    public String getHorario() {
        return horario;
    }


    public void setHorario(String horario) {
        this.horario = horario;
    }


    public Turma getTurma() {
        return turma;
    }


    public void setTurma(Turma turma) {
        this.turma = turma;
    }


    public Disciplina getDisciplina() {
        return disciplina;
    }


    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }


    @Override
    public String toString() {
        return "agendaProfessor [aulaPorDia=" + aulaPorDia + ", horario=" + horario + ", turma=" + turma
                + ", disciplina=" + disciplina + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + aulaPorDia;
        result = prime * result + ((horario == null) ? 0 : horario.hashCode());
        result = prime * result + ((turma == null) ? 0 : turma.hashCode());
        result = prime * result + ((disciplina == null) ? 0 : disciplina.hashCode());
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
        AgendaProfessor other = (AgendaProfessor) obj;
        if (aulaPorDia != other.aulaPorDia)
            return false;
        if (horario == null) {
            if (other.horario != null)
                return false;
        } else if (!horario.equals(other.horario))
            return false;
        if (turma == null) {
            if (other.turma != null)
                return false;
        } else if (!turma.equals(other.turma))
            return false;
        if (disciplina == null) {
            if (other.disciplina != null)
                return false;
        } else if (!disciplina.equals(other.disciplina))
            return false;
        return true;
    }

    public void adicionarAula(){

    }

    public void verificarConflitosDeAula(){

    }
    public void atualizarHorario(){

    }
    public void obterAulasPorDia(){

    }
    public void obterHorario(){

    }
    public void definirTurma(){

    }
    public void obterTurma(){

    }
    public void definirDisciplina(){

    }
    public void definirProfessor(){

    }
    public void obterProfessor(){

    }
}
