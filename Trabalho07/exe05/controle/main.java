package trabalho07.exer05.controle;
import trabalho07.exer05.dominio.Funcionario;


public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Gustavo","12345",2000.00);

        System.out.println("DADOS DO FUNCIONÁRIO");
        funcionario.exibirDados();

        System.out.println();

        System.out.println("Aumentando o salário para R$ 2500...");
        funcionario.setSalario(2500.00);

        funcionario.exibirDados();

        System.out.println();

        System.out.println("Tentando diminuir o salário para R$ 1500...");
        funcionario.setSalario(1500.00);

        System.out.println();

        funcionario.exibirDados();
    }
}
