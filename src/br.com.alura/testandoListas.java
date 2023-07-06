import java.util.ArrayList;
import java.util.Collections;

public class testandoListas {
    public static void main(String[] args) {
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3); // adicionando strings ao ArrayList

        System.out.println(aulas);

        aulas.remove(0); // remove uma das strings do array de acordo com sua posição

        System.out.println(aulas);

        for (String aula : aulas) { //para cada aula dentro de aulas
            System.out.println("Aula: " + aula);
        }

        String primeiraAula = aulas.get(0); // "pega" a String da posição que indicar
        System.out.println("A primeira aula é " + primeiraAula);

        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("Aula: " + aulas.get(i)); // dentro do laço for, entrega o valor de acordo com a posição
        }

        aulas.forEach(aula -> {
            System.out.println("percorrendo: " + aula);
        });

        aulas.add("Aumentando nosso conhecimento");
        Collections.sort(aulas); // ordena em ordem alfabética
        System.out.println(aulas);
    }
}