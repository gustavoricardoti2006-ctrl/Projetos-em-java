import java.util.Scanner;

public class exer05 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o total de segundos: ");
        int totalSegundos = sc.nextInt();

        int horas = totalSegundos / 3600;
        int resto = totalSegundos % 3600;

        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.print("O número " + totalSegundos + " equivale a "
                + horas + " hora(s), "
                + minutos + " minuto(s) e "
                + segundos + " segundo(s)");

        sc.close();
    }
}