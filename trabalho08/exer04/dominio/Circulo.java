public class Circulo extends FiguraGeometrica{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    //getters

    public double getRaio(){
         return raio;        
    }

    //setters

    public void setRaio(double valor){
         this.raio = valor;        
    }

    @Override
    public double calcularArea(){
        return 3.14 * raio;
    }
}