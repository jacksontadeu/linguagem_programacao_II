package edu.fatec.lp2.exercicio1;

import edu.fatec.lp2.exercicio1.model.*;


public class Main {
    public static void main(String[] args) {
        Whatsapp app = new Whatsapp();
        Contatinho c = new Contatinho("Jackson","12991357585");
        Contatinho c1 = new Contatinho("Luciana","12991557474");
        Contatinho c2 = new Contatinho("Lais","12991336699");
        Mensagem audio = new MsgAudio(c,"10:30","Bom dia!!!",2);
        Mensagem foto = new MsgFoto(c1,"12:00","boa tarde!!!", 15);
        Mensagem texto = new MsgTexto(c2,"15:00","boa tarde!!!");
        app.adicionarContatos(c);
        app.adicionarContatos(c1);
        app.adicionarContatos(c2);
        app.listarContatos();;
        app.adicionarMensagens(audio);
        app.adicionarMensagens(foto);
        app.adicionarMensagens(texto);
        app.listarMensagens();

    }
}