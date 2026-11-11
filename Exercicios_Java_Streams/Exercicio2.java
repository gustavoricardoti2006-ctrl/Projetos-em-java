import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return nome + " - R$ " + String.format("%.2f", preco);
    }
}

public class Exercicio2 {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
            new Produto("Notebook", 3500.00),
            new Produto("Mouse", 80.00),
            new Produto("Teclado", 150.00),
            new Produto("Monitor", 1200.00),
            new Produto("Headset", 250.00),
            new Produto("Webcam", 300.00)
        );

        double total = produtos.stream()
            .mapToDouble(Produto::getPreco)
            .sum();

        OptionalDouble media = produtos.stream()
            .mapToDouble(Produto::getPreco)
            .average();

        Optional<Produto> maisCaro = produtos.stream()
            .max(Comparator.comparingDouble(Produto::getPreco));

        System.out.printf("Total dos produtos: R$ %.2f%n", total);

        if (media.isPresent()) {
            System.out.printf("Preço médio: R$ %.2f%n", media.getAsDouble());
        } else {
            System.out.println("Não há produtos para calcular a média.");
        }

        maisCaro.ifPresent(produto ->
            System.out.println("Produto mais caro: " + produto)
        );
    }
}
