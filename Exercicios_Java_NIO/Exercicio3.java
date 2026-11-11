import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Exercicio3 {
    public static void main(String[] args) {
        Path arquivo = Path.of("produtos.csv");
        double totalInventario = 0;

        try {
            List<String> linhas = Files.readAllLines(arquivo);

            for (int i = 1; i < linhas.size(); i++) {
                try {
                    String[] dados = linhas.get(i).split(",");

                    if (dados.length != 3) {
                        System.out.println("Linha com formato inválido: " + linhas.get(i));
                        continue;
                    }

                    String nome = dados[0].trim();
                    int quantidade = Integer.parseInt(dados[1].trim());
                    double preco = Double.parseDouble(dados[2].trim());

                    double totalProduto = quantidade * preco;
                    totalInventario += totalProduto;

                    System.out.println("Produto: " + nome);
                    System.out.println("Quantidade: " + quantidade);
                    System.out.printf("Preço unitário: R$ %.2f%n", preco);
                    System.out.printf("Total: R$ %.2f%n", totalProduto);
                    System.out.println("----------------------");
                } catch (NumberFormatException e) {
                    System.out.println("Erro na conversão dos números: " + linhas.get(i));
                }
            }

            System.out.printf("Valor total do inventário: R$ %.2f%n", totalInventario);
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }
}
