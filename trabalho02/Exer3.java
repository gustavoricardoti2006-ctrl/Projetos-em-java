import java.util.Scanner;


public class Exer3{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);


        System.out.printf("Nota da AV1: ");
        double av1 = sc.nextDouble();

        System.out.printf("Nota da AV2: ");
        double av2 = sc.nextDouble();

        double media = (av2+av1)/2;

        if(media < 5){
            System.out.printf("Reprovado");
        }
        else if(media < 6){
            System.out.printf("Recuperação");
        }
        else{
            System.out.printf("Aprovado");
        }

        sc.close();

    }
}
