package trabalho09.exer03.controle;

import trabalho09.exer03.dominio.*;

public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario("gustavo", "1234");

        Administrador administrador =
                new Administrador("admin", "abcd", 10);

        System.out.println("=== Usuário ===");

        if (usuario.autenticar("1234")) {
            System.out.println("Usuário autenticado.");
        } else {
            System.out.println("Senha incorreta.");
        }

        System.out.println();

        System.out.println("=== Administrador ===");

        if (administrador.autenticar("abcd")) {
            System.out.println("Administrador autenticado.");
        } else {
            System.out.println("Senha incorreta.");
        }

        System.out.println("JSON:");
        System.out.println(administrador.exportarJSON());
    }
}