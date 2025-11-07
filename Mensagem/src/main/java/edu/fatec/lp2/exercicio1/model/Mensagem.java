package edu.fatec.lp2.exercicio1.model;

public abstract class Mensagem {
    private Contatinho destinatario;
    private String horaEnvio;
    private String conteudo;

    public Mensagem(Contatinho destinatario, String horaEnvio, String conteudo) {
        this.destinatario = destinatario;
        this.horaEnvio = horaEnvio;
        this.conteudo = conteudo;
    }

    public Contatinho getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Contatinho destinatario) {
        this.destinatario = destinatario;
    }

    public String getHoraEnvio() {
        return horaEnvio;
    }

    public void setHoraEnvio(String horaEnvio) {
        this.horaEnvio = horaEnvio;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public abstract Mensagem sendMessage(String mensagem);

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Mensagem{ ");
        sb.append(" destinatario: ").append(this.destinatario.getNome());
        sb.append(" horaEnvio: '").append(horaEnvio).append('\'');
        sb.append(" conteudo: '").append(conteudo).append('\'');

        return sb.toString();
    }
}
