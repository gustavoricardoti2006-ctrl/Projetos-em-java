import trabalho08.exe03.dominio.*;


public class Main {

    public static void processarEnvio(Notificacao notificacao, String texto) {
        notificacao.enviar(texto);
    }

    public static void main(String[] args) {

        EmailNotificacao email = new EmailNotificacao("gustavo@gmail.com");

        SmsNotificacao sms = new SmsNotificacao("21999999999");

        PushNotificacao push = new PushNotificacao( "celular-gustavo");

        enviar(email, "Olá Gustavo!");

        enviar(sms, "Seu código é 1234.");

        enviar(push, "Você recebeu uma nova mensagem.");
    }
}