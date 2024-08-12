package com.eleodoro.horario_eleodoro.modelo;

public class Professor {
    
    private String nome;
    private String cpf;

    public Professor() {
    }

    public Professor(String nome, String cpf) {
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

    @Override
    public String toString() {
        return "Professor [nome=" + nome + ", cpf=" + cpf + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
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
        Professor other = (Professor) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        return true;
    }

    public void cadastrarProfessor(nome: String, cpf: String ){
        
    }

    private void consultarProfessor(cpf: String ){
        
    }

    private void validarCpf(cpf: String ){
        
    }

    public void validarCpf( ){
        
    }

    public void adicionarDisciplina( ){
        
    }

    public void removerDisciplina( ){
        
    }

    public void atualizarDados( ){
        
    }

    public void obterDisciplina( ){
        
    }


    

}