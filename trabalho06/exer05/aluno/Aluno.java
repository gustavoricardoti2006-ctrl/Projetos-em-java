package trabalho06.exer05.aluno;

public class Aluno {

    public String nome;
    public String matricula;
    public double nota1;
    public double nota2;

    public double calcularMedia() {

        return (nota1 + nota2) / 2;
    }

    public String verificarAprovacao() {

        if (calcularMedia() > 7) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }

    public void imprimirBoletim() {

        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.printf("Media final: %.2f%n", calcularMedia());
        System.out.println("Situacao: " + verificarAprovacao());
    }
}