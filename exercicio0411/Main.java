package exercicio0411;

import exercicio0411.controller.ControlePessoas;
import exercicio0411.view.PessoasView;

public class Main {
    public static void main(String[] args) {
        ControlePessoas controller = new ControlePessoas();
        PessoasView view = new PessoasView(controller);
        view.exibirMenu();
    }
}