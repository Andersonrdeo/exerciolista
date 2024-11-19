import java.util.HashMap;

public class desafio20 {
    public static void main(String[] args) {

        HashMap<Integer, String> diasDaSemana = new HashMap<>();

        diasDaSemana.put(1, "Domingo");
        diasDaSemana.put(2, "Segunda-feira");
        diasDaSemana.put(3, "Terça-feira");
        diasDaSemana.put(4, "Quarta-feira");
        diasDaSemana.put(5, "Quinta-feira");
        diasDaSemana.put(3, "Quarta-feira");

        System.out.println(diasDaSemana);
    }
}