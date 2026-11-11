import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercicio5AgrupamentoProdutos {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Notebook", "Informática", 3500.00));
        produtos.add(new Produto("Mouse", "Informática", 80.00));
        produtos.add(new Produto("Arroz", "Alimentos", 25.50));
        produtos.add(new Produto("Feijão", "Alimentos", 8.90));
        produtos.add(new Produto("Java Efetivo", "Livros", 120.00));
        produtos.add(new Produto("Clean Code", "Livros", 95.00));
        produtos.add(new Produto("Teclado", "Informática", 150.00));

        Map<String, List<Produto>> porCategoria = new HashMap<>();

        for (Produto p : produtos) {
            porCategoria.computeIfAbsent(p.getCategoria(), k -> new ArrayList<>()).add(p);
        }

        for (Map.Entry<String, List<Produto>> entry : porCategoria.entrySet()) {
            System.out.println("\n== " + entry.getKey() + " ==");
            for (Produto p : entry.getValue()) {
                System.out.println(" - " + p);
            }
        }
    }
}
