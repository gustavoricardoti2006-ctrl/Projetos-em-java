package trabalho07.exer02.dominio;

public class ContaBancaria{
    private String numeroConta;
    private String titular;
    private double saldo;


public ContaBancaria(String numeroConta, String titular, double saldo){
    this.numeroConta = numeroConta;
    this.titular = titular;
    this.saldo = saldo;
}

public ContaBancaria(String numeroConta, String titular){
    this.numeroConta = numeroConta;
    this.titular = titular;
    this.saldo = 0;
}

// getters
public String getNumeroConta(){
    return numeroConta;
}

public String getTitular(){
    return titular;
}

//setters

public void setTitular(String titular){
    this.titular = titular;
}

public void sacar(double valor){
    if(saldo >= valor && valor > 0){
       this.saldo = saldo - valor;
    }
}

public void depositar(double valor){
    if(valor > 0){
        this.saldo = saldo + valor;
    }
    
}

}