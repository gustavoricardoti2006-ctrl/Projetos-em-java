import java.util.Scanner;

public class Exer5 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Lado 1: ");
        int l1 = sc.nextInt();

        System.out.printf("Lado 2: ");
        int l2 = sc.nextInt();

        System.out.printf("Lado 3: ");
        int l3 = sc.nextInt();

        if((l1+l2) > l3 || (l3+l2) > l1 || (l1+l3) > l2){
            if((l1 == l2) && (l2 == l3) && (l1 == l3)){
                System.out.printf("Equilátero: Todos os três lados iguais.");
            }
            else if((l2 == l1) || (l2 == l3) || (l3 == l1)){
                System.out.printf("Isósceles: Apenas dois lados iguais.");        
            }
            else{
                System.out.printf("Escaleno: Todos os três lados diferentes.\r\n");
            }
        }
        sc.close();
    }
}
