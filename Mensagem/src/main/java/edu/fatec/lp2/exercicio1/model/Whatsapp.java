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
            System.out.println("=========================================================");
        }
    }
    public void listarMensagens(){
        System.out.println("Lista de mensagens");
        for(Mensagem mensagem : mensagens){
            System.out.println(mensagem.toString());
        }

    }
    public void adicionarContatos(Contatinho contato){
        contatos.add(contato);
    }
    public void adicionarMensagens(Mensagem mensagem){
        mensagens.add(mensagem);
    }
}
