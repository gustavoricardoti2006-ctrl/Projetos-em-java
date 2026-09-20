package trabalho08.exe02.dominio;


public class Vendedor extends Funcionario{
    private double totalVendas;
    private double comissaoPercentual;
    
    public Vendedor(String nome, double salariobase, double vendas, double comissao){
        super(nome,salariobase);
        this.totalVendas = vendas;
        this.comissaoPercentual = comissao;
    }

    //getters
    public double getTotal(){
        return totalVendas;
    }

    public double getComissao(){
        return comissaoPercentual;
    }
    //setters
    public void setTotal(double total){
        this.totalVendas = total;
    }

    public void setComissao(double comissao){
        this.comissaoPercentual = comissao;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (totalVendas * comissaoPercentual);
    }
}