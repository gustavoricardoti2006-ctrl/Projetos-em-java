package trabalho09.exer01.controle;

import trabalho09.exer01.dominio.*;

public class Main {

    public static void finalizarCompra(MetodoPagamento metodo, double total) {
        System.out.println("=== Finalizando compra ===");

        metodo.processarPagamento(total);

        System.out.println(metodo.obterDetalhes());

        System.out.println();
    }

    public static void main(String[] args) {

        CartaoCredito cartao = new CartaoCredito(
                "1234-5678-9012-3456",
                1000.00
        );

        Pix pix = new Pix("gustavo@email.com");

        finalizarCompra(cartao, 250.00);

        finalizarCompra(pix, 150.00);
    }
}