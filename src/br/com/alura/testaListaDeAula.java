package br.com.alura;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class testaListaDeAula {
    public static void main(String[] args) {
        Aula a1 = new Aula("Exemplificando ArrayList", 21);
        Aula a2 = new Aula("Lista de Objetos", 19);
        Aula a3 = new Aula("Relacionamento de Objetos", 15);

        ArrayList<Aula> Aulas = new ArrayList<>();
        Aulas.add(a1);
        Aulas.add(a2);
        Aulas.add(a3);

        Collections.sort(Aulas); //comparando em ordem alfabética
        System.out.println(Aulas);

        Collections.sort(Aulas, Comparator.comparing(Aula::getTempo)); // comparando pelo tempo, do menor pro maior
        System.out.println(Aulas);

        Aulas.sort(Comparator.comparing(Aula::getTempo)); // sintaxe mais enxuta
        //forma de comparar com dois parâmetros:
        //aulas.sort(Comparator.comparing(aula::getTempo).thenComparing(aula::getTitulo));
    }
}
