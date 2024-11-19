import java.util.HashMap;

public class desafio9 {

    public static void main(String[] args) {

        HashMap<String, Integer> pessoas = new HashMap<>();
        pessoas.put("João", 98);
        pessoas.put("Maria", 198);
        pessoas.put("Dora", 36);

        String nome = "João";
        if (pessoas.containsKey(nome)) {
            System.out.println("Idade de " + nome + ": " + pessoas.get(nome));

        }
    }
}
