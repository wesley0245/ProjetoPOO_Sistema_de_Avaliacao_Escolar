package br.com.projetopoo.model;

public class Disciplina {
    private String nome;
    private Professor professorResponsavel;

    public Disciplina(String nome, Professor professorResponsavel) {
        this.nome = nome;
        this.professorResponsavel = professorResponsavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    @Override
    public String toString() {
        return "Disciplina: " + nome + ", Professor Responsável: " + professorResponsavel.getNome();
    }
}