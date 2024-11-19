import java.util.LinkedList;


public class desafio12 {

    public static void main(String[] args) {

        java.util.LinkedList<Integer> numeros;
        numeros = new LinkedList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        numeros.addFirst(0);
        numeros.addLast(6);

        System.out.println(numeros);

    }
}
