package trabalho09.exer04.dominio;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void cobrarTaxaMensal() {

        double taxa = 15.00;

        retirarSaldo(taxa);

        System.out.println(
                "Taxa de R$ 15,00 cobrada da conta corrente."
        );
    }
}