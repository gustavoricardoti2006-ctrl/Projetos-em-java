import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Aluno {
    private String nome;
    private String curso;
    private double notaFinal;

    public Aluno(String nome, String curso, double notaFinal) {
        this.nome = nome;
        this.curso = curso;
        this.notaFinal = notaFinal;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    @Override
    public String toString() {
        return nome + " - " + curso + " - Nota: " + notaFinal;
    }
}

public class Exercicio3 {
    public static void main(String[] args) {
        List<Aluno> alunos = Arrays.asList(
            new Aluno("Ana", "ADS", 8.5),
            new Aluno("Carlos", "Engenharia", 6.0),
            new Aluno("Beatriz", "ADS", 7.5),
            new Aluno("João", "Direito", 5.5),
            new Aluno("Mariana", "Engenharia", 9.0),
            new Aluno("Pedro", "Direito", 7.0),
            new Aluno("Lucas", "ADS", 6.5)
        );

        // Agrupa os alunos pelo curso.
        Map<String, List<Aluno>> alunosPorCurso = alunos.stream()
            .collect(Collectors.groupingBy(Aluno::getCurso));

        System.out.println("Alunos agrupados por curso:");
        alunosPorCurso.forEach((curso, lista) -> {
            System.out.println(curso + ":");
            lista.forEach(System.out::println);
        });

        // true = aprovado; false = reprovado.
        Map<Boolean, List<Aluno>> resultado = alunos.stream()
            .collect(Collectors.partitioningBy(aluno -> aluno.getNotaFinal() > 7.0));

        System.out.println("\\nAprovados:");
        resultado.get(true).forEach(System.out::println);

        System.out.println("\\nReprovados:");
        resultado.get(false).forEach(System.out::println);
    }
}
