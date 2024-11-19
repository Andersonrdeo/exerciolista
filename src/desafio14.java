import java.util.LinkedList;
import java.util.Queue;

public class desafio14 {
    public static void main(String[] args) {

        Queue<Integer> fila = new LinkedList<>();

        for (int i = 1; i <= 5; i++) {
            fila.add(i);
        }

        System.out.println("Remover número da lista:");
        while (!fila.isEmpty()) {
            int elemento = fila.poll();
            System.out.println("Número removido: " + elemento);
        }
    }
}