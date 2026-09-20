

public class ContaCorrente extends Conta {

    private double limiteChequeEspecial;

    public ContaCorrente(String numero, double saldo, double limiteChequeEspecial) {
        super(numero, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {

        double taxa = 2.00;

        double valorTotal = valor + taxa;

        if (valor > 0 && getSaldo() - valorTotal >= -limiteChequeEspecial) {
            super.sacar(valorTotal);
        }
    }
}