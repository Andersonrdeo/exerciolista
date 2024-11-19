import java.util.ArrayList;
import java.util.Collections;

public class desafio4 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(9);
        numeros.add(15);
        numeros.add(1);
        numeros.add(39);

        Collections.sort(numeros);
        System.out.println(numeros);
    }
}
