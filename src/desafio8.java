import java.util.HashMap;

public class desafio8 {

    public static void main(String[] args) {

    HashMap<String, Integer> pessoas = new HashMap<>();
            pessoas.put("João",98);
            pessoas.put("Maria",198);
            pessoas.put("Dora",36);

            for(
    String nome :pessoas.keySet()) {
                System.out.println(nome + ": " + pessoas.get(nome));
            }
    }
}