
public class CatalogoApp {
    public static void main(String[] args) {
        CatalogoService catalogo = new CatalogoService();

        // Cadastrar quatro produtos fora de ordem de preço
        catalogo.cadastrar(new Produto("01", "Monitor", 800.00, 5));
        catalogo.cadastrar(new Produto("02", "Mouse", 50.00, 10));
        catalogo.cadastrar(new Produto("03", "Teclado", 150.00, 8));
        catalogo.cadastrar(new Produto("04", "Cabo USB", 25.00, 20));

        // Exibir a lista inicial
        System.out.println("=== LISTA INICIAL ===");
        for (int i = 0; i < 4; i++) {
            System.out.println("Índice " + i + ": " + catalogo.obterPorPosicao(i));
        }

        // Excluir um produto intermediário
        System.out.println("\n=== EXCLUINDO O TECLADO ===");
        catalogo.excluirPorCodigo("03");

        // Ordenar os produtos pelo preço
        catalogo.ordenarPorPreco();

        // Exibir a lista final
        System.out.println("\n=== LISTA FINAL ORDENADA ===");
        for (int i = 0; i < 3; i++) {
            System.out.println("Índice " + i + ": " + catalogo.obterPorPosicao(i));
        }
    }
}
