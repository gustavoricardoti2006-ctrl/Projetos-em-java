package trabalho07.exer01.dominio;



public class Retangulo{
    private double altura;
    private double largura;


public Retangulo(double larg, double alt){
      this.largura = larg;
      this.altura = alt;
}

// getters

public double getAltura(){
    return altura;
}

public double getLargura(){
    return largura;
}

// setters

public void setAltura(double val){
   if(val > 0){
    this.altura = val;
   }
   else{
    this.altura = 1;
    System.out.printf("valor invalido, numero padrão colocado");
   }
}

public void setLargura(double val){
    if(val > 0){
        this.largura = val;
    }else{
    this.largura = 1;
    System.out.printf("valor invalido, numero padrão colocado");
   }
}

public double calcularArea(){
    return largura * altura;
}

public double calcularperimetro(){
    return (largura + altura) * 2;
}

}