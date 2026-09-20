package trabalho08.exer01.dominio;

public class Carro extends Veiculo{
    private int quantidadePortas;


public Carro(String marca, String modelo, int quant){
super(marca, modelo);
this.quantidadePortas = quant;

}

//getters
public int getPortas(){
    return quantidadePortas;
}

//setters
public void setPortas(int quantidadePortas){
    this.quantidadePortas = quantidadePortas;
}

@Override
public void exibirDetalhes() {
    super.exibirDetalhes();
    System.out.println("Portas: " + getPortas());
}
}