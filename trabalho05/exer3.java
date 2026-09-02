import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][4];
        int maior = Integer.MIN_VALUE;
        int linhaMaior = 0;
        int colunaMaior = 0;
        
        System.out.println("Preencha a matriz 3x4:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor para posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }
        
        System.out.println("\nMaior elemento: " + maior);
        System.out.println("Localização: Linha " + linhaMaior + ", Coluna " + colunaMaior);
        scanner.close();
    }
}