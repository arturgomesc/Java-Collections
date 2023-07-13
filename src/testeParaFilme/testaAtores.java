package testeParaFilme;

public class testaAtores {
    public static void main(String[] args) {
        Atores a1 = new Atores("Keanu Reeves", 58);
        Atores a2 = new Atores("Ashton Kutcher", 45);
        Atores a3 = new Atores("Wagner Moura", 47);

        Filme filme = new Filme("Action & Love", 200);

        filme.adiciona(a1);
        filme.adiciona(a2);
        filme.adiciona(a3);

        System.out.println(filme);
    }
}
