package trabalho07.exer01.dominio;

public class Produto(){

    private String nome;
    private Double preco;
    private Int quantEstoque;

    //construtor
    public Produto(String nome, Double valor, int estoque){
       this.nome = nome;
       this.preco = preco;
       this.quantEstoque = estoque;
    }

      public Produto(String nome, double preco){
       this(nome, preco, 0);
   }

   //Getters

    public getNome(){
        return nome;
    }

    public getPreco(){
        return preco;
    }
    public getEstoque(){
        return quantEstoque;
    }

   //starters

   public setNome(String nome){
       this.nome = nome;
   } 

   public setPreco(Double valor){
    if(valor > 0){
        this.preco = valor;
    }
   }

   public setEstoque(int estoque){
    this.quantEstoque = estoque
   }

   //mettod

   public Double calcularValorTotalEmEstoque(){
    return preco * quantEstoque;
   }

}
