import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exercicio4 {
    private static final Map<String, Integer> estoque = new HashMap<>();
    private static final int LIMITE_ALERTA = 5;

    public static void inserir(String codigo, int qtd) {
        estoque.put(codigo, qtd);
        System.out.println("Produto " + codigo + " inserido com " + qtd + " unidades.");
    }

    public static void atualizar(String codigo, int delta) {
        if (!estoque.containsKey(codigo)) {
            System.out.println("Código " + codigo + " não encontrado.");
            return;
        }
        int atual = estoque.get(codigo);
        int novo = atual + delta;
        if (novo < 0) {
            System.out.println("Operação inválida: estoque ficaria negativo.");
            return;
        }
        estoque.put(codigo, novo);
        System.out.println("Estoque de " + codigo + " atualizado para " + novo + ".");
    }

    public static void exibirAlerta() {
        System.out.println("\nProdutos com estoque abaixo de " + LIMITE_ALERTA + ":");
        boolean achou = false;
        for (Map.Entry<String, Integer> e : estoque.entrySet()) {
            if (e.getValue() < LIMITE_ALERTA) {
                System.out.println("- " + e.getKey() + ": " + e.getValue());
                achou = true;
            }
        }
        if (!achou) System.out.println("(nenhum)");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("\n1-Inserir 2-Atualizar 3-Alerta 0-Sair");
            System.out.print("Opção: ");
            op = Integer.parseInt(sc.nextLine().trim());
            switch (op) {
                case 1:
                    System.out.print("Código: ");
                    String c = sc.nextLine();
                    System.out.print("Quantidade: ");
                    int q = Integer.parseInt(sc.nextLine().trim());
                    inserir(c, q);
                    break;
                case 2:
                    System.out.print("Código: ");
                    String c2 = sc.nextLine();
                    System.out.print("Delta (+/-): ");
                    int d = Integer.parseInt(sc.nextLine().trim());
                    atualizar(c2, d);
                    break;
                case 3:
                    exibirAlerta();
                    break;
                case 0:
                    System.out.println("Encerrando.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 0);
        sc.close();
    }
}
