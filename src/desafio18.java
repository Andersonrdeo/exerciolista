import java.util.LinkedHashMap;

public class desafio18 {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> mapa = new LinkedHashMap<>();
        mapa.put("Maria", 16);
        mapa.put("João", 110);
        mapa.put("Dora", 80);
        mapa.put("Joana", 19);
        mapa.put("Mario", 35);

        mapa.remove(mapa.keySet().iterator().next());

        System.out.println(mapa);
    }
}