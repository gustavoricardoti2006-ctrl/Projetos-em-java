
public class SmsNotificacao extends Notificacao{

    public SmsNotificacao(String destinatario){
        super(destinatario);
    }

    @Override
    public void enviar(String mensagem){
    System.out.printfln("Enviando SMS para o número [" + destinatario + "]: " + mensagem); 
    }
}