import java.util.HashSet;
import java.util.TreeSet;

public class desafio17 {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(9);
        hashSet.add(3);
        hashSet.add(7);

        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);

        System.out.println("Desrodenado: " + hashSet);
        System.out.println("Ordenado: " + treeSet);
    }
}