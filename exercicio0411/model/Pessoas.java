
package exercicio0411.model;

public class Pessoas {

    private int id;
    private String nome;
    private int idade;
    private double altura;

    public Pessoas(int id, String nome, int idade, double altura) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Transforma os dados da pessoa em uma String
    public String toFileString() {
        return id + ";" + nome + ";" + idade + ";" + altura;
    }

    // Transforma a String do arquivo em um objeto Pessoa
    public static Pessoas fromFileString(String linha) {
        String[] dados = linha.split(";");

        int id = Integer.parseInt(dados[0]);
        String nome = dados[1];
        int idade = Integer.parseInt(dados[2]);
        double altura = Double.parseDouble(dados[3]);

        return new Pessoas(id, nome, idade, altura);
    }
}
