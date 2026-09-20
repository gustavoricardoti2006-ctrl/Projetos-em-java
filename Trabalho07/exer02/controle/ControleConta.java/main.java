package trabalho07.exer02.controle;
import  trabalho07.exer02.dominio.ContaBancaria;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ContaBancaria a = new ContaBancaria("1b2", "gustavo", 1330.50);

        System.out.println("conta A");
        System.out.println("conta: " + a.getNumeroConta());
        System.out.println("titular: " + a.getTitular());
        System.out.println("saldo: " + a.getSaldo());

        System.out.print("Depositar: ");
        double valorDeposito = sc.nextDouble();

        a.depositar(valorDeposito);

        System.out.println("Novo saldo: " + a.getSaldo());

        System.out.print("Sacar: ");
        double valorSaque = sc.nextDouble();

        a.sacar(valorSaque);

        System.out.println("Novo saldo: " + a.getSaldo());

        entrada.close();
    }
}