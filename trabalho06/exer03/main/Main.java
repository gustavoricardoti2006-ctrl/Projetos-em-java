package trabalho06.exer03.main;

import trabalho06.exer03.contabancaria.ContaBancaria;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria cb1 = new ContaBancaria();
        System.out.printf("titular: ");
        cb1.titular = sc.next();

        System.out.printf("Numero da conta: ");
        cb1.NumeroConta = sc.next();

        System.out.printf("saldo: ");
        cb1.saldo = sc.nextDouble();

    
             double valor=0;
             int esc;
        do{

    
        System.out.println("1 - depositar \n2 - sacar \n3 - saldo atual \n");
        esc = sc.nextInt();
       
        switch (esc) {
            case 1:
                System.out.printf("valor a depositar: ");
                 valor = sc.nextDouble();
                if (valor > 0) {
                    cb1.saldo = cb1.saldo + valor;
                } else {
                    System.out.println("valor é 0");
                }

                break;

            case 2:
                System.out.printf("valor a depositar: ");
                 valor = sc.nextDouble();

                cb1.saldo = cb1.saldo - valor;
                break;

            default:
                cb1.imprimirSaldo();
                break;
        }
            }while (esc != 0); 
        sc.close();
    }
}
