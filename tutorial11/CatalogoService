
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatalogoService {
    private final List produtos = new ArrayList<>();

    // Cadastrar produto
    public void cadastrar(Produto p) {
        if (p == null) {
            throw new IllegalArgumentException("Produto não pode ser nulo.");
        }

        if (produtos.contains(p)) {
            throw new IllegalArgumentException("Código já cadastrado.");
        }

        produtos.add(p);
    }

    // Obter produto pela posição
    public Produto obterPorPosicao(int indice) {
        if (indice < 0 || indice >= produtos.size()) {
            throw new IndexOutOfBoundsException("Índice inválido.");
        }

        return produtos.get(indice);
    }

    // Excluir produto pelo código
    public boolean excluirPorCodigo(String codigo) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getCodigo().equals(codigo)) {
                produtos.remove(i);
                return true;
            }
        }

        return false;
    }

    // Ordenar produtos por preço crescente
    public void ordenarPorPreco() {
        Collections.sort(produtos);
    }
}
