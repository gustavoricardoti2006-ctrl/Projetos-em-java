package trabalho07.exer04.dominio;


public class Carro {

    private String modelo;
    private int ano;
    private int velocidadeAtual;

   
    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
    }

    // Getters

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    // Setter

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

 

    public void acelerar(int val) {
        velocidadeAtual = velocidadeAtual + val;
    }


    public void frear(int val) {
        velocidadeAtual = velocidadeAtual - val;

        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
    }

    public boolean isEmMovimento() {
        return velocidadeAtual > 0;
    }
}