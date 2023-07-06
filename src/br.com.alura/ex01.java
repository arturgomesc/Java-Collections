import java.util.ArrayList;

public class ex01 {
    public static void main(String[] args) {
        ArrayList<String> amigos = new ArrayList<>();
        amigos.add("Gustavo");
        amigos.add("Rodrigo");
        amigos.add("Erick");

        System.out.println(amigos);

        for(String n : amigos) {
            System.out.println("Amigo: " + n);
        }

        System.out.println("Meu amigo indígena: " + amigos.get(0));
    }
}
