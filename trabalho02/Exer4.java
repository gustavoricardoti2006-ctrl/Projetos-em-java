import java.util.Scanner;


public class Exer4 {
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
     

        System.out.printf("numero 1°: ");
        int num1 = sc.nextInt();
        
        System.out.printf("numero 2°: ");
        int num2 = sc.nextInt();

        System.out.printf("numero 3°: ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.printf("O maior numero é" + num1 );
        }
        else if(num2 > num1 && num2 > num3){
            System.out.printf("O maior numeo é " + num2);
        }
        else{
            System.out.printf("O maior numeo é " + num3);
        }
        sc.close();
    }
}
