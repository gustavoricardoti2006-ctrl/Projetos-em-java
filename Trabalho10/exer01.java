import java.util.InputMismatchException;
import java.util.Scanner;

public class exer01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número inteiro: ");
            int numero1 = scanner.nextInt();

            System.out.print("Digite o segundo número inteiro: ");
            int numero2 = scanner.nextInt();

            int resultado = numero1 / numero2;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: não é possível dividir por zero.");

        } catch (InputMismatchException e) {
            System.out.println("Erro: digite apenas números inteiros.");

        } finally {
            System.out.println("Operação finalizada.");
            scanner.close();
        }
    }
}
