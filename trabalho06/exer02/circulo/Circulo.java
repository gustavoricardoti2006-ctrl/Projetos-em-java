package trabalho06.exer02.circulo;

public class Circulo {

    public double raio;

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public void exibirInformacoes() {
        System.out.println("Raio: " + raio);
        System.out.printf("Area: %.2f%n", calcularArea());
        System.out.printf("Perimetro: %.2f%n", calcularPerimetro());
    }
}