package trabalho09.exer04.dominio;

public abstract class ContaBancaria {

    private String numero;
    private double saldo;

    public ContaBancaria(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public double consultarSaldo() {
        return saldo;
    }

    protected void retirarSaldo(double valor) {
        saldo -= valor;
    }

    public String getNumero() {
        return numero;
    }

    public abstract void cobrarTaxaMensal();
}