package livro;

public class Livro {

    public String titulo;
    public String autor;
    public int numeroPaginas;

    public void exibirInformacoes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + numeroPaginas);
    }
}