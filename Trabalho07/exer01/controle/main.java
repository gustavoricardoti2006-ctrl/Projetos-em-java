package trabalho07.exer01.controle;

import trabalho07.exer01.dominio.Produto;

public class Main {

    public static void main(String[] args) {

        Produto a = new Produto("Batata", 0.88, 130);

        Produto b = new Produto("Tomate", 0.30);

        System.out.println("Produto A");
        System.out.println("Nome: " + a.getNome());
        System.out.println("Preço: " + a.getPreco());
        System.out.println("Estoque: " + a.getEstoque());

        System.out.println();

        System.out.println("Produto B");
        System.out.println("Nome: " + b.getNome());
        System.out.println("Preço: " + b.getPreco());
        System.out.println("Estoque: " + b.getEstoque());

        System.out.println();

        System.out.println("Valor total do estoque de A: " + a.calcularValorTotalEmEstoque());

        System.out.println();

        System.out.println("Preço antes: " + a.getPreco());

        a.setPreco(-10.0);

        System.out.println("Preço depois: " + a.getPreco());
    }
}