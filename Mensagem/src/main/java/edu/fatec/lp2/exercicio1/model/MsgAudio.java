package edu.fatec.lp2.exercicio1.model;

public class MsgAudio extends Mensagem{
    private Integer duracao;

    public MsgAudio(Contatinho destinatario, String horaEnvio, String conteudo, Integer duracao) {
        super(destinatario, horaEnvio, conteudo);
        this.duracao = duracao;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }


    @Override
    public Mensagem sendMessage(String mensagem) {
       mensagem = this.toString();

        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MsgAudio{");
        sb.append(super.toString());
        sb.append(" duracao: ").append(duracao);
        sb.append('}');
        return sb.toString();
    }
}
