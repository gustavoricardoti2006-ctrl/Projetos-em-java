import java.util.Scanner;

public class exer4 {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("começo inetvalo");
        int com = sc.nextInt();

        System.out.printf("fim inetvalo");
        int fim = sc.nextInt();

        if (com < fim) {
            int impar = 0, par = 0;

            for (int i = com; i < fim; i++) {
                if (i % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }
             System.out.printf("No intervalo de " + com + "-" + fim + ", extistem: \n" + par + " numeros pares e " + impar + " numeros impares" );
        }

       

        sc.close();
    }
}
