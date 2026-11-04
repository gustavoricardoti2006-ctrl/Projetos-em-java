
package exercicio0411.view;

import exercicio0411.controller.ControlePessoas;
import exercicio0411.model.Pessoas;
import java.util.InputMismatchException;
import java.util.Scanner;


public class PessoasView {

    private ControlePessoas controller;
    private Scanner scanner;

    public PessoasView(ControlePessoas controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Pessoa");
            System.out.println("2. Listar Pessoas");
            System.out.println("3. Alterar Pessoa");
            System.out.println("4. Excluir Pessoa");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = capturarInteiro();

            switch (opcao) {
                case 1 -> adicionarPessoa();
                case 2 -> listarPessoas();
                case 3 -> alterarPessoa();
                case 4 -> excluirPessoa();
                case 0 -> System.out.println("Encerrando o programa.");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }

    private void adicionarPessoa() {
        int id = capturarId();
        String nome = capturarString("Nome da pessoa: ");
        int idade = capturarInteiro("Idade da pessoa: ");
        double altura = capturarDouble("Altura da pessoa: ");

        controller.adicionarPessoa(id, nome, idade, altura);

        System.out.println("Pessoa adicionada com sucesso!");
    }

    private void listarPessoas() {
        for (Pessoas pessoa : controller.listarPessoa()) {
            System.out.println(
                "ID: " + pessoa.getId()
                + ", Nome: " + pessoa.getNome()
                + ", Idade: " + pessoa.getIdade()
                + ", Altura: " + pessoa.getAltura()
            );
        }
    }

    private void alterarPessoa() {
        int id = capturarId();
        String novoNome = capturarString("Novo nome: ");
        int novaIdade = capturarInteiro("Nova idade: ");
        double novaAltura = capturarDouble("Nova altura: ");

        if (controller.atualizarPessoa(id, novoNome, novaIdade, novaAltura)) {
            System.out.println("Pessoa alterada com sucesso!");
        } else {
            System.out.println("Pessoa com ID " + id + " não encontrada.");
        }
    }

    private void excluirPessoa() {
        int id = capturarId();

        if (controller.excluirPessoa(id)) {
            System.out.println("Pessoa excluída com sucesso!");
        } else {
            System.out.println("Pessoa com ID " + id + " não encontrada.");
        }
    }

    private int capturarId() {
        return capturarInteiro("ID da pessoa: ");
    }

    private int capturarInteiro() {
        return capturarInteiro(null);
    }

    private int capturarInteiro(String mensagem) {
        int valor = 0;
        boolean valido;

        do {
            try {
                if (mensagem != null) {
                    System.out.print(mensagem);
                }

                valor = scanner.nextInt();
                valido = true;

            } catch (InputMismatchException e) {
                System.out.println("Digite um número inteiro.");
                valido = false;
                scanner.nextLine();
            }

        } while (!valido);

        scanner.nextLine();
        return valor;
    }

    private double capturarDouble(String mensagem) {
        double valor = 0.0;
        boolean valido;

        do {
            try {
                System.out.print(mensagem);
                valor = scanner.nextDouble();
                valido = true;

            } catch (InputMismatchException e) {
                System.out.println("Digite um número decimal.");
                valido = false;
                scanner.nextLine();
            }

        } while (!valido);

        scanner.nextLine();
        return valor;
    }

    private String capturarString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }
}
