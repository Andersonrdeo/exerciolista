import java.util.ArrayList;

public class desafio19 {
    public static void main(String[] args) {

        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(5);
        lista1.add(9);
        lista1.add(18);

        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(6);
        lista2.add(3);
        lista2.add(28);

        lista1.addAll(lista2);

        System.out.println(lista1);
    }
}