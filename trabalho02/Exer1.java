import java.util.Scanner;

public class Exer1{
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = sc.nextInt(); 

        if (num % 2 == 0) {
            System.out.print("O numero " + num + " e par"); // Corrigido para System.out.print
        } else {
            System.out.print("O numero " + num + " e impar"); // Corrigido para System.out.print
        }

        sc.close(); // Boa prática: fechar o Scanner ao terminar
    }
}