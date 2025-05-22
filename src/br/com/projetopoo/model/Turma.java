package br.com.projetopoo.model;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nome;
    private List<Aluno> alunos;
    private List<Disciplina> disciplinas;

    public Turma(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    @Override
    public String toString() {
        return "Turma: " + nome + ", Alunos: " + alunos.size() + ", Disciplinas: " + disciplinas.size();
    }
}
