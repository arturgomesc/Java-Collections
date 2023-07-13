package br.com.alura;

public class TestaCursoComAluno {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 21));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        Aluno a1 = new Aluno("Caetano Veloso", 5678);
        Aluno a2 = new Aluno("Marcelo Rossi", 1890);
        Aluno a3 = new Aluno("Guilherme Boulos", 8143);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos os alunos matriculados nesse curso: ");
        javaColecoes.getAlunos().forEach( aluno -> {
            System.out.println(aluno);
        });

        Aluno turini = new Aluno("Rodrigo Turini", 3489);
        System.out.println(javaColecoes.estaMatriculado(turini));

        System.out.println(javaColecoes.estaMatriculado(a1));
        System.out.println(a1.equals("Caetano Veloso"));
    }
}
