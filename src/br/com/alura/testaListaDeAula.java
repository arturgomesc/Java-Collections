package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class testaListaDeAula {
    public static void main(String[] args) {
        aula a1 = new aula("Exemplificando ArrayList", 21);
        aula a2 = new aula("Lista de Objetos", 19);
        aula a3 = new aula("Relacionamento de Objetos", 15);

        ArrayList<aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        Collections.sort(aulas); //comparando em ordem alfabética
        System.out.println(aulas);

        Collections.sort(aulas, Comparator.comparing(aula::getTempo)); // comparando pelo tempo, do menor pro maior
        System.out.println(aulas);

        aulas.sort(Comparator.comparing(aula::getTempo)); // sintaxe mais enxuta
        //forma de comparar com dois parâmetros:
        //aulas.sort(Comparator.comparing(aula::getTempo).thenComparing(aula::getTitulo));
    }
}
