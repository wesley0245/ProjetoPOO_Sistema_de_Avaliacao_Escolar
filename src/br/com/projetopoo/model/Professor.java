package br.com.projetopoo.model;

public class Professor {
    private String nome;
    private String disciplinaPrincipal;

    public Professor(String nome, String disciplinaPrincipal) {
        this.nome = nome;
        this.disciplinaPrincipal = disciplinaPrincipal;
    }

    public String getNome() {
        return nome;
    }

    public String getDisciplinaPrincipal() {
        return disciplinaPrincipal;
    }

    @Override
    public String toString() {
        return "Professor: " + nome + ", Disciplina Principal: " + disciplinaPrincipal;
    }
}
