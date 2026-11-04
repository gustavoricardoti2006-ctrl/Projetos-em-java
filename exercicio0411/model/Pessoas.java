package exercicio0411.model;

public class Pessoas{
    private int id;
    private String nome;
    private int idade;
    private double altura;

    public Pessoas(int id, String nome, int idade, double altura){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static Pessoas fromFileString(String arquivopessoas){
        
           String data[] = arquivopessoas.split(";");

           if(data.length != 4){

            throw new IllegalArgumentException("a quantidade de valores nessa pessoa é anoral");
           }

        try{
            int id = Integer.parseInt(data[0]);
            String nome = data[1];
            int idade = Integer.parseInt(data[2]);
            double altura = Double.parseDouble(data[3]);

            return new Pessoas(id, nome, idade, altura);
         
        }catch(NumberFormatException e){
            throw new IllegalArgumentException("Formato numérico inválido em: ");
        }
    }


    public char[] toFileString() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toFileString'");
    }

}