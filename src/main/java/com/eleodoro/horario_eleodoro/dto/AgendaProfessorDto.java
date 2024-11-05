package com.eleodoro.horario_eleodoro.dto;

import com.eleodoro.horario_eleodoro.controller.AgendaProfessorController;
import com.eleodoro.horario_eleodoro.modelo.Disciplina;
import com.eleodoro.horario_eleodoro.modelo.Turma;

public class AgendaProfessorDto {
    
    private int aulaPorDia;
    private String horario;
    private Turma turma;
    private Disciplina disciplina;
    
    public AgendaProfessorDto() {
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

    public AgendaProfessorController novoAgendaProfessor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'novoAgendaProfessor'");
    }
    
    
}
