public class exer03 {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente("12345", 1000.00);

        try {
            conta.sacar(300.00);
            conta.sacar(500.00);
            conta.sacar(500.00);

        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
