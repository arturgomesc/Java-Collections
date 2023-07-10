package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private String instrutor;
    private List<aula> aulas = new ArrayList<aula>();

    public List<aula> getAulas() {
        return aulas;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }
}
