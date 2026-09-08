package trabalho06.exer05.main;
import trabalho06.exer05.aluno.Aluno;
public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.nome = "Gustavo";
        aluno.matricula = "2026001";
        aluno.nota1 = 8;
        aluno.nota2 = 9;

        aluno.imprimirBoletim();
    }
}