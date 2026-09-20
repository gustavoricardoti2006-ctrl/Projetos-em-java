package trabalho08.exe02.controle;
import trabalho08.exe02.dominio.*;

public class Main {

    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[3];

        funcionarios[0] = new Funcionario("Gustavo", 2000.00);

        funcionarios[1] = new Gerente("Joao", 3000.00, 1000.00);

        funcionarios[2] = new Vendedor( "Maria",2000.00,10000.00,0.05);

        double folhaTotal = 0;

        for (int i = 0; i < funcionarios.length; i++) {

            System.out.println("Funcionário: " + funcionarios[i].getNome());

            double salario = funcionarios[i].calcularSalario();

            System.out.printf("Salário: R$ %.2f%n", salario);

            System.out.println();

            folhaTotal = folhaTotal + salario;
        }

        System.out.printf("Folha total: R$ %.2f%n", folhaTotal);
    }
}
