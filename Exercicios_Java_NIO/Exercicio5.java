import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercicio5 {
    public static void main(String[] args) {
        Path arquivoOriginal = Path.of("clientes_bruto.txt");
        Path arquivoNovo = Path.of("clientes_padronizado.txt");

        try (Stream<String> linhas = Files.lines(arquivoOriginal)) {
            List<String> clientes = linhas
                .map(String::trim)
                .filter(linha -> !linha.isBlank())
                .map(nome -> nome.substring(0, 1).toUpperCase(Locale.forLanguageTag("pt-BR"))
                    + nome.substring(1).toLowerCase(Locale.forLanguageTag("pt-BR")))
                .collect(Collectors.toList());

            Files.write(arquivoNovo, clientes,
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING);

            System.out.println("Arquivo padronizado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao processar arquivo: " + e.getMessage());
        }
    }
}
