package testeParaFilme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Filme implements Comparable<Filme>{
    private String titulo;
    private int duracao;

    private List<Atores> atores = new ArrayList<Atores>();

    public String getTitulo() {
        return titulo;
    }
    public int getDuracao() {
        return duracao;
    }

    public List<Atores> getAtores() {
        return Collections.unmodifiableList(atores);
    }

    public void adiciona(Atores atores){
        this.atores.add(atores);
    }

    public Filme(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Filme: " + this.titulo + " Duração: " + this.duracao + "\nAtores: " + this.atores;
    }

    @Override
    public int compareTo(Filme outroFilme) {
        return this.titulo.compareTo(outroFilme.titulo);
    }
}
