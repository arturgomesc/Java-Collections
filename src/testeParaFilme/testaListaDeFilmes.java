package testeParaFilme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class testaListaDeFilmes {
    public static void main(String[] args) {
        filme f1 = new filme("O Poderoso Chefão", 120);
        filme f2 = new filme("Spiderverse", 100);
        filme f3 = new filme("Mad Max", 210);

        ArrayList<filme> Filmes = new ArrayList<>();
        Filmes.add(f1);
        Filmes.add(f2);
        Filmes.add(f3);

        Collections.sort(Filmes);
        System.out.println("Filmes em ordem alfabética: ");
        System.out.println(Filmes);
        System.out.println();

        Filmes.sort(Comparator.comparing(filme::getDuracao));

        System.out.println("Filmes por ordem de duração: ");
        Filmes.forEach( filme -> {
            System.out.println(filme);
            System.out.println();
        });

        //filme.sort(Comparator.comparing(Filmes::getTempo)); substituiría o CompareTo
    }
}
