package br.com.projetopoo.model;

public class Professor extends Pessoa {
    private String disciplinaPrincipal;

    public Professor(String nome, String disciplinaPrincipal) {
        super(nome);
        this.disciplinaPrincipal = disciplinaPrincipal;
    }

    public String getDisciplinaPrincipal() {
        return disciplinaPrincipal;
    }

    public void setDisciplinaPrincipal(String disciplinaPrincipal) {
        this.disciplinaPrincipal = disciplinaPrincipal;
    }

    @Override
    public String toString() {
        return "Professor: " + nome + ", Disciplina Principal: " + disciplinaPrincipal;
    }
}