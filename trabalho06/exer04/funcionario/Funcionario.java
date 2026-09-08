package trabalho06.exer04.funcionario;

public class Funcionario {

    public String nome;
    public String cargo;
    public double salarioBruto;

    public void aplicarAumento(double porcentagem) {

        salarioBruto += salarioBruto * porcentagem / 100;
    }

    public double calcularSalarioLiquido(double descontoImposto) {

        return salarioBruto - descontoImposto;
    }
}
