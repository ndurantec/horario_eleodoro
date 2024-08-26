package com.eleodoro.horario_eleodoro.modelo;

public class CalendarioEscolar {
    
    private int ano;
    private int feriado;
    private int semestre;
    
    public CalendarioEscolar() {
    }

    public CalendarioEscolar(int ano, int feriado, int semestre) {
        this.ano = ano;
        this.feriado = feriado;
        this.semestre = semestre;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getFeriado() {
        return feriado;
    }

    public void setFeriado(int feriado) {
        this.feriado = feriado;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "CalendarioEscolar [ano=" + ano + ", feriado=" + feriado + ", semestre=" + semestre + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ano;
        result = prime * result + feriado;
        result = prime * result + semestre;
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
        CalendarioEscolar other = (CalendarioEscolar) obj;
        if (ano != other.ano)
            return false;
        if (feriado != other.feriado)
            return false;
        if (semestre != other.semestre)
            return false;
        return true;
    }


    
}

