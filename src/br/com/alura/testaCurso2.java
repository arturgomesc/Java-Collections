package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testaCurso2 {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 21));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulasMutaveis);
        System.out.println(aulasMutaveis);

        System.out.println(javaColecoes.getTempoTotal());
        System.out.println(javaColecoes);
    }
}
