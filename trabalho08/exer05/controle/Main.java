import trabalho08.exe05.dominio.*;


public class Main {

    public static void main(String[] args) {

        ContaPoupanca poupanca =
            new ContaPoupanca("001", 1000.00, 0.05);

        ContaCorrente corrente =
            new ContaCorrente("002", 500.00, 1000.00);

        System.out.println("=== POUPANÇA ===");

        System.out.printf("Saldo inicial: R$ %.2f%n",
                poupanca.getSaldo());

        poupanca.aplicarRendimento();

        System.out.printf("Depois do rendimento: R$ %.2f%n",
                poupanca.getSaldo());

        poupanca.sacar(200);

        System.out.printf("Depois do saque: R$ %.2f%n",
                poupanca.getSaldo());


        System.out.println();

        System.out.println("=== CONTA CORRENTE ===");

        System.out.printf("Saldo inicial: R$ %.2f%n",
                corrente.getSaldo());

        corrente.sacar(300);

        System.out.printf("Depois do saque de R$ 300: R$ %.2f%n",
                corrente.getSaldo());

        corrente.sacar(1000);

        System.out.printf("Depois do saque de R$ 1000: R$ %.2f%n",
                corrente.getSaldo());
    }
}