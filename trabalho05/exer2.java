import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matriz = new double[4][4];
        double somaDiagonal = 0;
        
        System.out.println("Preencha a matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor para posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextDouble();
                
                // Soma os elementos da diagonal principal
                if (i == j) {
                    somaDiagonal += matriz[i][j];
                }
            }
        }
        
        System.out.println("\nSoma dos elementos da diagonal principal: " + somaDiagonal);
        scanner.close();
    }
}