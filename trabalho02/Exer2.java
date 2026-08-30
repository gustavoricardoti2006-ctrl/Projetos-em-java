
import java.util.Scanner;

public class Exer2{
    public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o ano em que você nasceu: ");
    int anonasc = sc.nextInt();

    System.out.print("Digite o ano atual: ");
    int ano = sc.nextInt();


    int idade = ano - anonasc;

    if(idade > 18){
        System.out.print("com a idade de "+ idade + ", você já é adulto ");
    }
    else{
        System.out.print("com a idade de "+ idade + ", você não é adulto ainda");
    }



    sc.close();
    }
    
}
