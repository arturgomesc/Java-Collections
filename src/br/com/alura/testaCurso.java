package br.com.alura;

import java.util.List;

public class testaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Java", "Paulo Silveira");

        List<Aula> Aulas = javaColecoes.getAulas();

        //javaColecoes.getAulas().add(new Aula("Java Collections",21));
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 21));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
        System.out.println(Aulas);
    }
}
