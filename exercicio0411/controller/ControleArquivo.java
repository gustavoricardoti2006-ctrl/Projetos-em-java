package exercicio0411.controller;

import java.io.*;
import java.util.ArrayList;
import exercicio0411.model.Pessoas;

public class ControleArquivo {

    private final String arquivoPessoas = "Pessoas.txt";

    // Salva a lista de pessoas no arquivo
    public void salvarPessoas(ArrayList<Pessoas> listapessoas) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoPessoas))) {

            for (Pessoas pessoa : listapessoas) {
                writer.write(pessoa.toFileString());
                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println("Erro ao salvar pessoas: " + e.getMessage());
        }
    }

    // Carrega as pessoas salvas no arquivo
    public ArrayList<Pessoas> carregarPessoas() {

        ArrayList<Pessoas> listaPessoas = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoPessoas))) {

            String linha;

            while ((linha = reader.readLine()) != null) {
                listaPessoas.add(Pessoas.fromFileString(linha));
            }

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de pessoas não encontrado. Será criado ao salvar novos cadastros.");

        } catch (IOException e) {
            System.out.println("Erro ao carregar pessoas: " + e.getMessage());
        }

        return listaPessoas;
    }
}