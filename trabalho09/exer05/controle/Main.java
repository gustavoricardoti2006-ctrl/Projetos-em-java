package trabalho09.exer05.controle;

import java.util.ArrayList;
import java.util.List;

import trabalho09.exer05.dominio.*;

public class Main {

    public static double calcularTotalImpostos(
            List<Tributavel> itensTributaveis) {

        double total = 0;

        for (Tributavel item : itensTributaveis) {

            total += item.calcularTributo();
        }

        return total;
    }

    public static void main(String[] args) {

        Eletronico celular =
                new Eletronico(1, 2000.00);

        Eletronico notebook =
                new Eletronico(2, 4000.00);

        Alimento arroz =
                new Alimento(3, 30.00);

        List<Tributavel> itensTributaveis =
                new ArrayList<>();

        itensTributaveis.add(celular);
        itensTributaveis.add(notebook);

        double totalImpostos =
                calcularTotalImpostos(itensTributaveis);

        System.out.println("=== IMPOSTOS ===");

        System.out.println(
                "Imposto do celular: R$ "
                + celular.calcularTributo()
        );

        System.out.println(
                "Imposto do notebook: R$ "
                + notebook.calcularTributo()
        );

        System.out.println(
                "Total de impostos: R$ "
                + totalImpostos
        );
    }
}