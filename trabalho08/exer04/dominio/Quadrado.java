public class Quadrado extends FiguraGeometrica{

    private double lado;

     public Quadrado(double lado) {
        this.lado = lado;
    }

    //getters

    public double getLado(){
         return lado;        
    }

    //setters

    public void setLado(double valor){
        this.lado = valor;
    }

    @Override
    public double calcularArea(){
        return lado * lado;
    }
}