import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

public class Exercicio1 {
    public static void main(String[] args) {
        Path diretorio = Path.of("dados", "relatorios");
        Path arquivo = diretorio.resolve("sumario.txt");

        try {
            Files.createDirectories(diretorio);

            String relatorio = """
                    RELATÓRIO DE EXECUÇÃO DO SISTEMA

                    Sistema: Sistema Java
                    Status: Executado com sucesso
                    Data e hora: %s
                    """.formatted(LocalDateTime.now());

            Files.writeString(arquivo, relatorio,
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING);

            System.out.println("Arquivo criado em: " + arquivo);
        } catch (IOException e) {
            System.out.println("Erro ao criar relatório: " + e.getMessage());
        }
    }
}
