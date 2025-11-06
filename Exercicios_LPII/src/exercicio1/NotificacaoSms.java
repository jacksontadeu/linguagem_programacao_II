package exercicio1;

public class NotificacaoSms extends Notificacao{
    @Override
    public String enviar() {
        return "mensagem de SMS";
    }
}
