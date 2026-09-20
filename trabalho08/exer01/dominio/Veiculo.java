package trabalho08.exer01.dominio;

public class Veiculo{
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo){
    this.marca =  marca;
    this.modelo = modelo;
    }

    //getters

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    //setters
    
    public void setMarca(String marca){
        this.marca = marca;
    }

     public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void exibirDetalhes() {
    System.out.println("Marca: " + getMarca());
    System.out.println("Modelo: " + getModelo());
}
    
}