package br.com.alura;
 import java.util.Collections;
 import java.util.HashSet;
 import java.util.Set;

public class testaAlunos {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");

        System.out.println(alunos.size());

        boolean estaMatriculado = alunos.contains("Artur Gomes");
        System.out.println(estaMatriculado);

        System.out.println();
        alunos.remove("Sergio Lopes");
        System.out.println(alunos);

        System.out.println();
        for (String aluno : alunos) { // foreach 1
            System.out.println(aluno);
        }

        alunos.add("Artur Gomes");
        System.out.println();
        alunos.forEach(aluno -> { // foreach 2
            System.out.println(aluno);
        });

        alunos.add("Davi Gomes"); //foreach 3
        alunos.forEach(System.out::println);
    }
}
