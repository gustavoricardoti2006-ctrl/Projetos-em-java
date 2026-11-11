import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Funcionario {
    private String nome;
    private String departamento;
    private double salario;

    public Funcionario(String nome, String departamento, double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }
}

public class Exercicio5 {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = Arrays.asList(
            new Funcionario("Ana", "TI", 3500.00),
            new Funcionario("Carlos", "Vendas", 2800.00),
            new Funcionario("Beatriz", "TI", 4200.00),
            new Funcionario("João", "RH", 3100.00),
            new Funcionario("Mariana", "TI", 5000.00),
            new Funcionario("Pedro", "Financeiro", 3900.00)
        );

        // Seleciona somente funcionários do departamento de TI.
        Predicate<Funcionario> filtroTI = funcionario ->
            funcionario.getDepartamento().equalsIgnoreCase("TI");

        // Calcula o salário com reajuste projetado de 10%.
        Function<Funcionario, Double> reajuste = funcionario ->
            funcionario.getSalario() * 1.10;

        // Exibe o salário projetado.
        Consumer<Double> imprimir = salario ->
            System.out.printf("Salário projetado: R$ %.2f%n", salario);

        // Pipeline: filtrar, transformar e consumir o resultado.
        funcionarios.stream()
            .filter(filtroTI)
            .map(reajuste)
            .forEach(imprimir);
    }
}
