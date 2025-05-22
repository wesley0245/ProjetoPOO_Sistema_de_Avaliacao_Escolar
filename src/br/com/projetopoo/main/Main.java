package br.com.projetopoo.main;

import br.com.projetopoo.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criar professor e disciplina
        Professor prof = new Professor("João Silva", "Matemática");
        Disciplina disciplina = new Disciplina("Matemática", prof);

        // Exibir professor e disciplina
        System.out.println("=== Informações da Disciplina ===");
        System.out.println(disciplina); // já mostra o professor no toString()
        System.out.println();

        // Criar alunos
        Aluno aluno1 = new Aluno("Maria", "2021001");
        Aluno aluno2 = new Aluno("Carlos", "2021002");

        // Criar turma e adicionar alunos e disciplina
        Turma turma = new Turma("Turma A");
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        turma.adicionarDisciplina(disciplina);

        // Exibir informações da turma
        System.out.println("=== Informações da Turma ===");
        System.out.println(turma);
        System.out.println("Alunos na Turma:");
        for (Aluno aluno : turma.getAlunos()) {
            System.out.println("- " + aluno);
        }
        System.out.println("Disciplinas na Turma:");
        for (Disciplina d : turma.getDisciplinas()) {
            System.out.println("- " + d);
        }
        System.out.println();

        // Criar matrículas
        Matricula matricula1 = new Matricula(aluno1, disciplina);
        Matricula matricula2 = new Matricula(aluno2, disciplina);

        // Exibir matrículas
        System.out.println("=== Matrículas ===");
        System.out.println(matricula1);
        System.out.println(matricula2);
        System.out.println();

        // Criar notas
        Nota nota1 = new Nota(aluno1, disciplina, 8.5);
        Nota nota2 = new Nota(aluno2, disciplina, 7.0);

        // Criar lista de notas
        List<Nota> notas = new ArrayList<>();
        notas.add(nota1);
        notas.add(nota2);

        // Gerar relatório de desempenho
        RelatorioDesempenho relatorio = new RelatorioDesempenho(notas);

        System.out.println("=== Relatório de Desempenho ===");
        relatorio.gerarRelatorio();
    }
}
