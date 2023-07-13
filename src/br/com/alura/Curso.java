package br.com.alura;

import java.util.*;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>(); //aqui, posso escolher entre usar ArrayList ou LinkedList.
    // No final do código existe a explicação.
    private Set<Aluno> alunos = new HashSet<>();

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public int getTempoTotal() {
        int tempoTotal = 0;
        for (Aula aula : aulas) {
            tempoTotal += aula.getTempo();
        }

        return tempoTotal;
    }

    @Override
    public String toString() {
        return "Curso: " + nome + ", Instrutor: " + instrutor + "; tempo: " + getTempoTotal() + ", aulas: " + this.aulas;
    }
}

/*
    Diferença entre ArrayList e Linkedlist:

    - ArrayList busca um elemento dentro de um Array de forma muito rápida. Porém, para adicionar, remover ou modificar
    elementos dentro dp Array não é a melhor opção, pois o ArrayList realoca cada um dos elementos individualmente,
    consumindo assim muita memória.

    - Em LinkedList é muito mais fácil de fazer modificações dentro do Array durante o código, mas é muito lento para
    acessar um elemento dentro do mesmo, pois ele conta de um por um até chegar no elemento solicitado.

    Conclusão: ArrayList para acessar facilmente elementos dentro de um Array, e LinkedList para modificar mais facil-
    mente esse Array.
 */
