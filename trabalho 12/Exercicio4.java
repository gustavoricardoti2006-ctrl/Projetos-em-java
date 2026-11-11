import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Exercicio4 {
    public static void main(String[] args) {
        Path diretorio = Path.of("src");
        long[] tamanhoTotal = {0};

        try (Stream<Path> arquivos = Files.walk(diretorio)) {
            arquivos
                .filter(Files::isRegularFile)
                .filter(arquivo -> arquivo.toString().endsWith(".java"))
                .forEach(arquivo -> {
                    try {
                        long tamanho = Files.size(arquivo);
                        tamanhoTotal[0] += tamanho;
                        System.out.println(diretorio.relativize(arquivo)
                            + " - " + tamanho + " bytes");
                    } catch (IOException e) {
                        System.out.println("Erro ao verificar arquivo: " + arquivo);
                    }
                });

            System.out.println("----------------------");
            System.out.println("Tamanho total: " + tamanhoTotal[0] + " bytes");
        } catch (IOException e) {
            System.out.println("Erro ao percorrer diretório: " + e.getMessage());
        }
    }
}
