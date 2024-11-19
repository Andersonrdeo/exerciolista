import java.util.ArrayList;
import java.util.Comparator;

class Pessoa1 {
    private String nome;
    private int idade;

    public Pessoa1(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}

public class desafio13 {
    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("João", 30));
        pessoas.add(new Pessoa("Maria", 25));
        pessoas.add(new Pessoa("Mario", 35));
        pessoas.add(new Pessoa("Dora", 20));

        pessoas.sort(Comparator.comparingInt(Pessoa::getIdade));

        System.out.println("Lista ordenada por idade:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}