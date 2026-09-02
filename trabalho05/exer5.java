import java.util.Scanner;

public class exer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] A = new int[2][3];
        int[][] A_T = new int[3][2];
        
        System.out.println("Preencha a matriz A 2x3:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para posição [" + i + "][" + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }
        
        // Construindo a matriz transposta
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                A_T[j][i] = A[i][j];
            }
        }
        
        System.out.println("\nMatriz A original:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nMatriz transposta A^T (3x2):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(A_T[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}