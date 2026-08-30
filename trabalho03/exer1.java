import java.util.Scanner;

public class exer1{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Diga o numero: ");
        int num = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.printf(num + "*" + i + "=" + (num * i) + "\n");
        }


        sc.close();

    }
}