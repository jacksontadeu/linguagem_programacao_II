package edu.fatec.lp2.exercicio1.model;

public class MsgTexto extends Mensagem{
    private Integer numChar;

    public MsgTexto(Contatinho destinatario, String horaEnvio, String conteudo) {
        super(destinatario, horaEnvio, conteudo);

    }

    public Integer getNumChar() {
        return numChar;
    }

    public void setNumChar(Integer numChar) {
        this.numChar = numChar;
    }

    @Override
    public Mensagem sendMessage(String mensagem) {
        mensagem = this.toString();
        return this;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MsgTexto {");
        sb.append(super.toString());
        sb.append(" Quantidade de Caracteres: ").append(super.getConteudo().length());
        sb.append('}');
        return sb.toString();
    }


}
