import java.util.HashMap;

class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome + " - " + idade + " anos";
    }

    public int getIdade() {
        return 0;
    };
}


public class desafio11 {

    public static void main(String[] args) {
        HashMap<String, Pessoa> mapa = new HashMap<>();
        mapa.put("João", new Pessoa("João", 36));
        mapa.put("Maria", new Pessoa("Maria", 230));
        mapa.put("Dora", new Pessoa("Dora", 118));

        for (String chave : mapa.keySet()) {
            System.out.println(chave + ": " + mapa.get(chave));
        }
    }
}
