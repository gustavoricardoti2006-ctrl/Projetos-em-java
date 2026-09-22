package trabalho09.exer01.dominio;

public class Pix implements MetodoPagamento {

    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado via Pix.");
    }

    @Override
    public String obterDetalhes() {
        return "Pagamento via Pix | Chave: " + chavePix;
    }
}