package trabalho09.exer04.controle;

import java.util.ArrayList;
import java.util.List;

import trabalho09.exer04.dominio.*;

public class Main {

    public static void main(String[] args) {

        List<ContaBancaria> contas = new ArrayList<>();

        contas.add(new ContaCorrente("001", 1000.00));

        contas.add(new ContaEmpresarial("002", 5000.00));

        System.out.println("=== SALDOS ANTES DA TAXA ===");

        for (ContaBancaria conta : contas) {

            System.out.println(
                    "Conta " + conta.getNumero()
                    + " | Saldo: R$ "
                    + conta.consultarSaldo()
            );
        }

        System.out.println();

        System.out.println("=== VIRADA DO MÊS ===");

        for (ContaBancaria conta : contas) {

            conta.cobrarTaxaMensal();
        }

        System.out.println();

        System.out.println("=== SALDOS APÓS A TAXA ===");

        for (ContaBancaria conta : contas) {

            System.out.println(
                    "Conta " + conta.getNumero()
                    + " | Saldo: R$ "
                    + conta.consultarSaldo()
            );
        }
    }
}