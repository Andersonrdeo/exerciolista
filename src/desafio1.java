import java.util.ArrayList;

public class desafio1 {
            public static void main(String[] args) {

            ArrayList<Integer> numeros = new ArrayList<>();

            numeros.add(10);
            numeros.add(20);
            numeros.add(30);
            numeros.add(40);
            numeros.add(50);


            System.out.println("Números da lista:");
            for (int i = 0; i < numeros.size(); i++) {
                System.out.println(numeros.get(i));

        }
    }
}
