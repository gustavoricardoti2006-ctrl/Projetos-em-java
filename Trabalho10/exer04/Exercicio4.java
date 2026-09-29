public class Exercicio4 {

    public static void main(String[] args) {

        Eleitor eleitor = new Eleitor();

        try {
            eleitor.cadastrar("João", 25);
            eleitor.cadastrar("Maria", 45);
            eleitor.cadastrar("Carlos", -5);
            eleitor.cadastrar("Pedro", 150);

        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
