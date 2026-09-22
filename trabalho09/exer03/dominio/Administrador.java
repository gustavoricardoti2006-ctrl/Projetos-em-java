package trabalho09.exer03.dominio;

public class Administrador implements Autenticavel, ExportavelJSON {

    private String login;
    private String senha;
    private int nivelAcesso;

    public Administrador(String login, String senha, int nivelAcesso) {
        this.login = login;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    @Override
    public String exportarJSON() {
        return "{"
                + "\"login\":\"" + login + "\","
                + "\"nivelAcesso\":" + nivelAcesso
                + "}";
    }

    public String getLogin() {
        return login;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }
}