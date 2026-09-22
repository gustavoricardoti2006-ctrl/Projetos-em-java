package trabalho09.exer04.dominio;

public class ContaEmpresarial extends ContaBancaria {

    public ContaEmpresarial(String numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void cobrarTaxaMensal() {

        double taxa = 30.00 + (consultarSaldo() * 0.005);

        retirarSaldo(taxa);

        System.out.println(
                "Taxa empresarial de R$ " + taxa + " cobrada."
        );
    }
}