import java.util.Scanner;

public class exer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][3];
        int[] somaLinhas = new int[4];
        
        System.out.println("Preencha a matriz 4x3:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                somaLinhas[i] += matriz[i][j];
            }
        }
        
        System.out.println("\nSoma por linhas:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Linha " + i + ": " + somaLinhas[i]);
        }
        
        scanner.close();
    }
}