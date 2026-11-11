import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> turmaA = new HashSet<>();
        Set<Integer> turmaB = new HashSet<>();

        System.out.print("Quantas matrículas na Turma A? ");
        int nA = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < nA; i++) {
            System.out.print("Matrícula A" + (i + 1) + ": ");
            turmaA.add(Integer.parseInt(sc.nextLine().trim()));
        }

        System.out.print("Quantas matrículas na Turma B? ");
        int nB = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < nB; i++) {
            System.out.print("Matrícula B" + (i + 1) + ": ");
            turmaB.add(Integer.parseInt(sc.nextLine().trim()));
        }

        Set<Integer> uniao = new HashSet<>(turmaA);
        uniao.addAll(turmaB);
        System.out.println("\nUnião (todas as matrículas, sem repetição): " + uniao);

        Set<Integer> intersecao = new HashSet<>(turmaA);
        intersecao.retainAll(turmaB);
        System.out.println("Interseção (nas duas turmas): " + intersecao);

        sc.close();
    }
}
