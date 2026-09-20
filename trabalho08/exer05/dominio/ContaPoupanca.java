

public class ContaPoupanca extends Conta {

    private double taxaRendimento;

    public ContaPoupanca(String numero, double saldo, double taxaRendimento) {
        super(numero, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void aplicarRendimento() {

        double rendimento = getSaldo() * taxaRendimento;

        depositar(rendimento);
    }
}