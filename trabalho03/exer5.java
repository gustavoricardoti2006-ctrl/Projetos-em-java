import java.util.Scanner;

public class exer5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo: ");
        int num = sc.nextInt();

        while (num < 0) {
            System.out.print("Número inválido. Digite um número não negativo: ");
            num = sc.nextInt();
        }

        long fatorial = 1;

        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }

        System.out.println(num + "! = " + fatorial);

        sc.close();
    }
}

