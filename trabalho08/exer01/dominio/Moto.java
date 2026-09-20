package trabalho08.exer01.dominio;


public class Moto extends Veiculo{
    private int cilindradas;


public Moto(String marca, String modelo, int quant){
super(marca, modelo);
this.cilindradas = quant;
}

//getters
public int getCilindradas(){
    return cilindradas;
}

//setters
public void setCilindradas(int cilindradas){
    this.cilindradas = cilindradas;
}


@Override
public void exibirDetalhes() {
    super.exibirDetalhes();
    System.out.println("Portas: " + getCilindradas());
}
}