package trabalho06.exer04.main;
import trabalho06.exer04.funcionario.Funcionario;
public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Gustavo";
        funcionario.cargo = "Desenvolvedor";
        funcionario.salarioBruto = 3000;

        System.out.printf("Salario antes do aumento: R$ %.2f%n",funcionario.salarioBruto);

        funcionario.aplicarAumento(10);

        System.out.printf("Salario depois do aumento: R$ %.2f%n",
                funcionario.salarioBruto);

        double salarioLiquido = funcionario.calcularSalarioLiquido(500);

        System.out.printf("Salario liquido: R$ %.2f%n",
                salarioLiquido);
    }
}
