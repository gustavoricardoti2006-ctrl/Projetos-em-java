
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> tarefas = new ArrayList<>();

        System.out.println("Digite 5 tarefas iniciais:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Tarefa " + i + ": ");
            tarefas.add(sc.nextLine());
        }

        System.out.println("\nLista atual: " + tarefas);

        // Remover por índice ou nome
        System.out.print("\nRemover por (1) índice ou (2) nome? ");
        int opcao = Integer.parseInt(sc.nextLine().trim());
        if (opcao == 1) {
            System.out.print("Índice a remover: ");
            int idx = Integer.parseInt(sc.nextLine().trim());
            if (idx >= 0 && idx < tarefas.size()) {
                tarefas.remove(idx);
                System.out.println("Removida por índice.");
            } else {
                System.out.println("Índice inválido.");
            }
        } else {
            System.out.print("Nome da tarefa a remover: ");
            String nome = sc.nextLine();
            if (tarefas.remove(nome)) {
                System.out.println("Tarefa removida.");
            } else {
                System.out.println("Tarefa não encontrada.");
            }
        }

        // Verificar existência
        System.out.print("\nVerificar se tarefa existe (nome): ");
        String busca = sc.nextLine();
        System.out.println(tarefas.contains(busca) ? "Existe na lista." : "Não existe.");

        // Ordenar alfabeticamente
        Collections.sort(tarefas);
        System.out.println("\nLista ordenada alfabeticamente:");
        for (String t : tarefas) {
            System.out.println("- " + t);
        }

        sc.close();
    }
}
