import java.io.IOException;

public class ServicoArquivo {

    public void processarArquivo(String caminho)
            throws ProcessamentoDadosException {

        try {

            if (caminho == null || caminho.isEmpty()) {
                throw new IOException("O caminho do arquivo é inválido.");
            }

            if (caminho.equals("erro.txt")) {
                throw new IllegalArgumentException(
                    "Erro ao interpretar os dados do arquivo."
                );
            }

            System.out.println("Arquivo processado com sucesso.");

        } catch (IOException e) {

            throw new ProcessamentoDadosException(
                "Não foi possível processar o arquivo.",
                e
            );

        } catch (IllegalArgumentException e) {

            throw new ProcessamentoDadosException(
                "Falha no processamento dos dados.",
                e
            );
        }
    }
}
