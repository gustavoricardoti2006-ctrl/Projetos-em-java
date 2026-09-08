package exer02.main;

import circulo.Circulo;

public class Main {

    public static void main(String[] args) {

        Livro livro1 = new Livro();

        livro1.titulo = "One piece";
        livro1.autor = "Oda";
        livro1.numeroPaginas = 3300;

        livro1.exibirInformacoes();
    }
}