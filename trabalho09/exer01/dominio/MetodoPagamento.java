package trabalho09.exer01.dominio;

public interface MetodoPagamento {

    void processarPagamento(double valor);

    String obterDetalhes();
}