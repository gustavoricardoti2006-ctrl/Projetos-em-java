package trabalho09.exer02.controle;

import trabalho09.exer02.dominio.*;

public class Main {

    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo("Azul", 5.0, 3.0);

        Circulo circulo = new Circulo("Vermelho", 4.0);

        retangulo.exibirCor();
        System.out.println("Área do retângulo: " + retangulo.calcularArea());

        System.out.println();

        circulo.exibirCor();
        System.out.println("Área do círculo: " + circulo.calcularArea());
    }
}