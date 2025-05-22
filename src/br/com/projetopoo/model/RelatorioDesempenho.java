package br.com.projetopoo.model;

import java.util.List;

public class RelatorioDesempenho {
    private List<Nota> notas;

    public RelatorioDesempenho(List<Nota> notas) {
        this.notas = notas;
    }

    public void gerarRelatorio() {
        System.out.println("Relatório de Desempenho:");
        for (Nota nota : notas) {
            System.out.println(nota);
        }
    }
}
