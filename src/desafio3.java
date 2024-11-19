import java.util.ArrayList;

public class desafio3 {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("maçã");
        frutas.add("banana");
        frutas.add("laranja");
        frutas.add("abacaxi");

        int index = frutas.indexOf("banana");
        if (index != -1) {
            System.out.println("Elemento encontrado no índice: " + index);
        } else {
            System.out.println("Elemento não encontrado.");
        }
    }
}
