package trabalho07.exer04.controle;
import trabalho07.exer01.dominio.Carro;

public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro("Civic", 2025);

        System.out.println("CARRO");
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Velocidade inicial: " + carro.getVelocidadeAtual());
        System.out.println("Está em movimento? " + carro.isEmMovimento());

        System.out.println();

        carro.acelerar(50);

        System.out.println("Depois de acelerar 50 km/h:");
        System.out.println("Velocidade: " + carro.getVelocidadeAtual());
        System.out.println("Está em movimento? " + carro.isEmMovimento());

        System.out.println();

        carro.acelerar(30);

        System.out.println("Depois de acelerar mais 30 km/h:");
        System.out.println("Velocidade: " + carro.getVelocidadeAtual());

        System.out.println();

        carro.frear(20);

        System.out.println("Depois de frear 20 km/h:");
        System.out.println("Velocidade: " + carro.getVelocidadeAtual());

        System.out.println();

        carro.frear(100);

        System.out.println("Depois de frear 100 km/h:");
        System.out.println("Velocidade: " + carro.getVelocidadeAtual());
        System.out.println("Está em movimento? " + carro.isEmMovimento());
    }
}