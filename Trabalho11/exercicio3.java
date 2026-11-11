import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um texto:");
        String texto = sc.nextLine().toLowerCase();

        String[] palavras = texto.split("\\s+");
        Map<String, Integer> frequencia = new HashMap<>();

        for (String p : palavras) {
            if (!p.isEmpty()) {
                frequencia.put(p, frequencia.getOrDefault(p, 0) + 1);
            }
        }

        System.out.println("\nFrequência de palavras:");
        for (Map.Entry<String, Integer> entry : frequencia.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        sc.close();
    }
}
