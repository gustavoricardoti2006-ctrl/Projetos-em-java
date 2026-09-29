public class Exercicio5 {

    public static void main(String[] args) {

        ServicoArquivo servico = new ServicoArquivo();

        try {
            servico.processarArquivo("");

        } catch (ProcessamentoDadosException e) {

            System.out.println("Erro principal: " + e.getMessage());

            if (e.getCause() != null) {
                System.out.println(
                    "Motivo raiz: " + e.getCause().getMessage()
                );
            }
        }
    }
}
