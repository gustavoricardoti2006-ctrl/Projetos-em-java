import java.util.Scanner;

public class exer02 {

    public static void main(String[] args) {

        String[] valores = {"10", "25", "abc", "50"};

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um índice de 0 a 3: ");
            int indice = scanner.nextInt();

            int numero = Integer.parseInt(valores[indice]);

            System.out.println("Número convertido: " + numero);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: índice inexistente.");

        } catch (NumberFormatException e) {
            System.out.println("Erro: o valor dessa posição não é um número válido.");

        } finally {
            scanner.close();
        }
    }
}
