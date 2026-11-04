package exercicio0411.controller;
import java.io.*;
import java.util.ArrayList;
import exercicio0411.model.Pessoas;
// Classe responsável por salvar e carregar dados de produtos em arquivo texto
public class ControleArquivo {

    // Caminho (relativo) do arquivo que será usado para persistir os dados dos produtos
    private final String arquivoPessoas = "Pessoas.txt";

    // Método responsável por salvar a lista de produtos no arquivo
    public void salvarPessoas(ArrayList<Pessoas> listapessoas) {
        // Usa try-with-resources para garantir que o BufferedWriter será fechado automaticamente
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoPessoas))) {
            // Para cada produto na lista
            for (Pessoas produto : listapessoas) {
                // Converte o produto em string formatada e escreve no arquivo
                writer.write(produto.toFileString());
                writer.newLine(); // Adiciona uma quebra de linha após cada produto
            }
        } catch (IOException e) {
            // Captura e exibe erro caso haja problema ao escrever no arquivo
            System.out.println("Erro ao salvar produtos: " + e.getMessage());
        }
    }

    // Método responsável por carregar os produtos salvos no arquivo e reconstruir a lista
    public ArrayList<Pessoas> carregarPessoas() {
        // Cria uma nova lista para armazenar os produtos lidos do arquivo
        ArrayList<Pessoas> listaPessoas = new ArrayList<>();

        // Usa try-with-resources para garantir o fechamento automático do BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoPessoas))) {
            String linha;
            // Lê o arquivo linha por linha até o final (null)
            while ((linha = reader.readLine()) != null) {
                // Converte cada linha em um objeto Produto e adiciona à lista
                listaPessoas.add(Pessoas.fromFileString(linha));
            }
        } catch (FileNotFoundException e) {
            // Caso o arquivo ainda não exista, exibe uma mensagem amigável (não trata como erro grave)
            System.out.println("Arquivo de produtos não encontrado. Será criado ao salvar novos produtos.");
        } catch (IOException e) {
            // Captura e exibe outros erros de entrada/saída
            System.out.println("Erro ao carregar produtos: " + e.getMessage());
        }

        // Retorna a lista de produtos carregados (pode estar vazia, se o arquivo não existir)
        return listaPessoas;
    }
}