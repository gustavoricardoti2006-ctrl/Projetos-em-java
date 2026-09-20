
public class EmailNotificacao extends Notificacao{

    public EmailNotificacao(String destinatario){
        super(destinatario);
    }

    @Override
    public void enviar(String mensagem){
    System.out.printfln("Enviando E-mail para [" + destinatario + "]: " + mensagem); 
    }
}