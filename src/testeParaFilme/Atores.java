package testeParaFilme;

public class Atores {
    private String nome;
    private String idade;

    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return idade;
    }

    public Atores(String nome, int idade) {
        this.nome = nome;
        this.idade = String.valueOf(idade);
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
