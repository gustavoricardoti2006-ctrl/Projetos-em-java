public class Retangulo extends FiguraGeometrica{

    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    //getters

    public double getLargura(){
         return largura;        
    }

    public double getAltura(){
         return altura;        
    }

    //setters

    public void setLargura(double largura){
         this.largura = largura;        
    }

    public void setAltura(double altura){
         this.altura = altura;        
    }

    @Override
    public double calcularArea(){
        return largura * altura;
    }
}