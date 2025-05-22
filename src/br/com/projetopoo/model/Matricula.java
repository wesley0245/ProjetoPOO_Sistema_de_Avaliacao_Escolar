package br.com.projetopoo.model;

public class Matricula {
    private Aluno aluno;
    private Disciplina disciplina;

    public Matricula(Aluno aluno, Disciplina disciplina) {
        this.aluno = aluno;
        this.disciplina = disciplina;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    @Override
    public String toString() {
        return "Matrícula - Aluno: " + aluno.getNome() + ", Disciplina: " + disciplina.getNome();
    }
}