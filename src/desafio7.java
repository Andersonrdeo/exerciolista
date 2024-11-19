import java.util.HashSet;

public class desafio7 {

    public static void main(String[] args) {

        HashSet<Integer> numeros = new HashSet<>();

        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        numeros.add(25);

        if (numeros.contains(15)) {
            System.out.println("Com o número 15");
        } else {
            System.out.println("Sem o número 15");
        }
    }
}