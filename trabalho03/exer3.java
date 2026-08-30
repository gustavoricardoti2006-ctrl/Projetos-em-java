import java.util.Scanner;

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
