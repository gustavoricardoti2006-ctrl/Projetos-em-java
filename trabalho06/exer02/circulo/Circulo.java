package trabalho06.exer02.circulo;

public class Circulo {
    double raio;

    public void CalcularPi(){
        double pi = 3.14 * (raio * raio);
        System.out.printf("O valor de pi: "+ pi);
    }

     public void calcularPerimetro(){
        double perimetro = 3.14 * 2 * raio;
        System.out.printf("O valor de pi: "+ perimetro);
    }
}
