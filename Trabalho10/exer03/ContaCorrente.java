public class ContaCorrente {

    private String numero;
    private double saldo;

    public ContaCorrente(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {

        if (valor > saldo) {
            throw new SaldoInsuficienteException(
                "Saldo insuficiente para realizar o saque."
            );
        }

        saldo -= valor;

        System.out.println("Saque realizado com sucesso.");
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
