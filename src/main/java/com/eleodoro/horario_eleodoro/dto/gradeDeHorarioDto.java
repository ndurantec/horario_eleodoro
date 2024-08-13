package com.eleodoro.horario_eleodoro.dto;

import java.time.LocalDateTime;

public class gradeDeHorarioDto {
    
    private LocalDateTime diaDaSemana;
    private int posicaoDaAula;
    private Turma turma;
    
    public gradeDeHorarioDto() {
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

    
}
