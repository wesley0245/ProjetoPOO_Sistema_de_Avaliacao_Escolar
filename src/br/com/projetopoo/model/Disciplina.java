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

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    @Override
    public String toString() {
        return "Disciplina: " + nome + ", Professor Responsável: " + professorResponsavel.getNome();
    }
}
