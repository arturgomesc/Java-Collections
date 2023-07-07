import java.util.ArrayList;
import java.util.Collections;

public class ex01 {
    public static void main(String[] args) {
        ArrayList<String> amigos = new ArrayList<>();
        amigos.add("Gustavo");
        amigos.add("Rodrigo");
        amigos.add("Erick");
        amigos.add("Tiago");
        amigos.add("Renan");
        amigos.add("Luiz");

        System.out.println(amigos);

        for(String n : amigos) {
            System.out.println("Amigo: " + n);
        }

        Collections.sort(amigos);
        System.out.println(amigos);
    }
}
