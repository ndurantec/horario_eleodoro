package com.eleodoro.horario_eleodoro.modelo;

public class Laboratorio {
    
    private int computadorDisponivel;
    private int salaDiponivel;
    private String resevada;
    
    public Laboratorio() {
    }

    public Laboratorio(int computadorDisponivel, int salaDiponivel, String resevada) {
        this.computadorDisponivel = computadorDisponivel;
        this.salaDiponivel = salaDiponivel;
        this.resevada = resevada;
    }

    public int getComputadorDisponivel() {
        return computadorDisponivel;
    }

    public void setComputadorDisponivel(int computadorDisponivel) {
        this.computadorDisponivel = computadorDisponivel;
    }

    public int getSalaDiponivel() {
        return salaDiponivel;
    }

    public void setSalaDiponivel(int salaDiponivel) {
        this.salaDiponivel = salaDiponivel;
    }

    public String getResevada() {
        return resevada;
    }

    public void setResevada(String resevada) {
        this.resevada = resevada;
    }

    @Override
    public String toString() {
        return "Laboratorio [computadorDisponivel=" + computadorDisponivel + ", salaDiponivel=" + salaDiponivel
                + ", resevada=" + resevada + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + computadorDisponivel;
        result = prime * result + salaDiponivel;
        result = prime * result + ((resevada == null) ? 0 : resevada.hashCode());
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
        Laboratorio other = (Laboratorio) obj;
        if (computadorDisponivel != other.computadorDisponivel)
            return false;
        if (salaDiponivel != other.salaDiponivel)
            return false;
        if (resevada == null) {
            if (other.resevada != null)
                return false;
        } else if (!resevada.equals(other.resevada))
            return false;
        return true;
    }

    
    
}
