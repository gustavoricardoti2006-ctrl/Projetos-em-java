public class Funcionario {

    private String nome;
    private double salariobase;

    public Funcionario(String nome, double valor) {
        this.nome = nome;
        this.salariobase = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salariobase;
    }

    public double calcularSalario() {
        return salariobase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salariobase) {
        this.salariobase = salariobase;
    }
}