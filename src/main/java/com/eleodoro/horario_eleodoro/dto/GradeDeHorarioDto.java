package com.eleodoro.horario_eleodoro.dto;

import java.time.LocalDateTime;

import com.eleodoro.horario_eleodoro.modelo.GradeDeHorario;
import com.eleodoro.horario_eleodoro.modelo.Turma;

public class GradeDeHorarioDto {
    
    private LocalDateTime diaDaSemana;
    private int posicaoDaAula;
    private Turma turma;
    
    public GradeDeHorarioDto() {
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

    public GradeDeHorario novoGradeDeHorario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'novoGradeDeHorario'");
    }

    
}
