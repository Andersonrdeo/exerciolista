import java.util.TreeMap;

public class desafio10 {

    public static void main(String[] args) {
        TreeMap<String, Integer> pessoas = new TreeMap<>();
        pessoas.put("João", 126);
        pessoas.put("Maria", 86);
        pessoas.put("Dora", 62);
        pessoas.put("Joana", 15);
        pessoas.put("Mario", 18);

        for (String nome : pessoas.keySet()) {
            System.out.println(nome + ": " + pessoas.get(nome));
        }
    }

}
