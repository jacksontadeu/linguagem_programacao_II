package edu.fatec.lp2.exercicio1.model;

public class MsgFoto extends Mensagem{
    private Integer tamanho;

    public MsgFoto(Contatinho destinatario, String horaEnvio, String conteudo, Integer tamanho) {
        super(destinatario, horaEnvio, conteudo);
        this.tamanho = tamanho;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public Mensagem sendMessage(String mensagem) {
        mensagem = this.toString();
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MsgFoto{");
        sb.append(super.toString());
        sb.append(" Tamanho: ").append(this.getTamanho());
        sb.append('}');
        return sb.toString();
    }
}
