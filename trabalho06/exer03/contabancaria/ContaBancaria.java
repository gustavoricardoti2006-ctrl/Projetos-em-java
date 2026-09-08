package trabalho06.exer03.contabancaria;

public class ContaBancaria {
    public String titular;
    public String NumeroConta;
    public double saldo;


    public void imprimirSaldo(){
        System.out.print("O Saldo atual da conta: "+ saldo);
    }
}
