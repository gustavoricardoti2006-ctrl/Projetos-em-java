package trabalho07.exer01.dominio;

public class Produto {

    private String nome;
    private double preco;
    private int quantEstoque;

    //construtor
    public Produto(String nome, double preco, int estoque){
       this.nome = nome;
       this.preco = preco;
       this.quantEstoque = estoque;
    }

      public Produto(String nome, double preco){
       this(nome, preco, 0);
   }

   //Getters

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }
    public int getEstoque(){
        return quantEstoque;
    }

   //starters

   public void setNome(String nome){
       this.nome = nome;
   } 

   public void setPreco(double valor){
    if(valor > 0){
        this.preco = valor;
    }
   }

   public void setEstoque(int estoque){
    if(estoque > 0){
        this.quantEstoque = estoque;
    }
    
   }

   //mettod

   public double calcularValorTotalEmEstoque(){
    return preco * quantEstoque;
   }

}
