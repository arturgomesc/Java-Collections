package testeParaFilme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class testaListaDeFilmes {
    public static void main(String[] args) {
        Filme f1 = new Filme("O Poderoso Chefão", 120);
        Filme f2 = new Filme("Spiderverse", 100);
        Filme f3 = new Filme("Mad Max", 210);

        ArrayList<Filme> Filmes = new ArrayList<>();
        Filmes.add(f1);
        Filmes.add(f2);
        Filmes.add(f3);

        Collections.sort(Filmes);
        System.out.println("Filmes em ordem alfabética: ");
        System.out.println(Filmes);
        System.out.println();

        Filmes.sort(Comparator.comparing(Filme::getDuracao));

        System.out.println("Filmes por ordem de duração: ");
        Filmes.forEach(Filme -> {
            System.out.println(Filme);
            System.out.println();
        });

        //filme.sort(Comparator.comparing(Filmes::getTempo)); substituiría o CompareTo
    }
}
