package edu.fatec.lp2.exercicio1.model;

import java.util.ArrayList;
import java.util.List;

public class Whatsapp {
    private List<Contatinho> contatos;
    private List<Mensagem> mensagens;

    public Whatsapp() {
        this.contatos = new ArrayList<>();
        this.mensagens = new ArrayList<>();
    }
    public void listarContatos(){
        System.out.println("Lista de Contatos");
        for(Contatinho contato: contatos){
            System.out.println("Nome: "+ contato.getNome());
            System.out.println("Celular: "+ contato.getCelular());
        }
    }
    public void listarMensagens(){
        System.out.println("Lista de mensagens");
        for(Mensagem mensagem : mensagens){
            System.out.println("Destinatário: " + mensagem.getDestinatario());
            System.out.println("Conteúdo:" + mensagem.getConteudo());
            System.out.println("Enviada: " + mensagem.getHoraEnvio() + " hpras");
        }

    }
    public void adicionarContatos(Contatinho contato){
        contatos.add(contato);
    }
}
