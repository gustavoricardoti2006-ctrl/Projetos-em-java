
import java.util.Scanner;
public class exer1{
    public static void main(String[] arg){
        scanner sc = new Scanner(System.in);

        System.out.printf("Diga o numero: ");
        int num = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.printf(num + "*" + i "=" + (num * i));
        }


    }
}
public class exer3 {
    public static void main(String[] arg){
        
        Scanner sc = new Scanner(System.in);

        String senha = "senha123";
        String confirm;

        do{
            System.out.printf("Diga a senha corretamente");
            confirm = sc.next();
            
        }while(!senha.equals(confirm));

        System.out.printf("senha confirmada");

        sc.close();
    }
}
