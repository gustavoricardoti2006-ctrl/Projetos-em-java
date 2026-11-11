import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio4 {

    public static List<String> processarLista(
        List<String> lista,
        TransformadorTexto regra
    ) {
        return lista.stream()
            .map(regra::transformar)
            .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> textos = Arrays.asList("java", "streams", "lambda");

        // Lambda: inverte cada texto.
        List<String> invertidos = processarLista(textos, texto ->
            new StringBuilder(texto).reverse().toString()
        );

        // Lambda: coloca cada texto entre colchetes.
        List<String> colchetes = processarLista(textos, texto ->
            "[" + texto + "]"
        );

        // Method Reference: transforma para letras maiúsculas.
        List<String> maiusculos = processarLista(textos, String::toUpperCase);

        System.out.println("Invertidos: " + invertidos);
        System.out.println("Entre colchetes: " + colchetes);
        System.out.println("Maiúsculos: " + maiusculos);
    }
}
