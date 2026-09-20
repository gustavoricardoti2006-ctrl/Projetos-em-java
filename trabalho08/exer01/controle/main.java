package trabalho08.exe02.controle;
import trabalho08.exe02.dominio.*;

public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro("Toyota", "Corolla", 4);

        Moto moto = new Moto("Honda", "CB 500", 500);

        System.out.println("CARRO");
        carro.exibirDetalhes();

        System.out.println();

        System.out.println("MOTO");
        moto.exibirDetalhes();
    }
}