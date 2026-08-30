import java.util.Scanner;

public class exer2{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int num = 1;
        int cont = 0;
        int sum = 0;

        do{
           System.out.printf("digite o "+ cont + "° numero: ");
           num = sc.nextInt();
           if (num > 0) { 
            sum += num; 
            cont++;
         }
        } while (num > 0);

        double media = sum/cont;
        System.out.printf("A soma dessa lista de " + cont + "numeros é igual a:" + media);
        sc.close();
    }
}