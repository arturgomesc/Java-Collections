package testeParaFilme;

public class filme implements Comparable<filme>{
    private String titulo;
    private int duracao;

    public String getTitulo() {
        return titulo;
    }
    public int getDuracao() {
        return duracao;
    }

    public filme(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Filme: " + this.titulo + " Duração: " + this.duracao;
    }

    @Override
    public int compareTo(filme outroFilme) {
        return this.titulo.compareTo(outroFilme.titulo);
    }
}
