package trabalho07.exer03.controle;
import  trabalho07.exer03.dominio.Retangulo;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {


        Retangulo a = new Retangulo(2.5, 5.6);

        System.out.printf("Altura: "+ a.getAltura());
        System.out.printf("Largura: "+ a.getLargura());
        System.out.printf("Perimetro: "+ a.calcularperimetro());
        System.out.printf("Area: "+ a.calcularArea());

    }
}