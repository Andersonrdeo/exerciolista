import java.util.Stack;

public class desafio15 {
    public static void main(String[] args) {

        Stack<String> pilha = new Stack<>();
        pilha.push("A");
        pilha.push("B");
        pilha.push("C");
        pilha.push("D");

        while (!pilha.isEmpty()) {
            System.out.println("Removendo: " + pilha.pop());
        }
    }
}