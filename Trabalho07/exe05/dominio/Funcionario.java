package trabalho07.exer05.dominio;

public class Funcionario {

    private String nome;
    private String matricula;
    private double salario;

    // Construtor
    public Funcionario(String nome, String matricula, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    // Getters

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getSalario() {
        return salario;
    }


    public void setSalario(double novoSalario) {

        if (novoSalario > salario) {
            salario = novoSalario;
        } else {
            System.out.println("Erro: o novo salário deve ser maior que o salário atual.");
        }
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.printf("Salário: R$ %.2f%n", salario);
    }
}
