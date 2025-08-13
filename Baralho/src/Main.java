import entities.enums.Naipe;
import entities.models.Baralho;
import entities.models.Carta;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carta carta1 = new Carta("Ás", Naipe.OURO);
        Carta carta2 = new Carta("Rei", Naipe.ESPADAS);
        Carta carta3 = new Carta("Valete", Naipe.PAUS);
        Carta carta4 = new Carta("Dama", Naipe.COPAS);
        Carta carta5 = new Carta("2", Naipe.OURO);


        Baralho baralho = new Baralho();
        baralho.adicionarCarta(carta1);
        baralho.adicionarCarta(carta2);
        baralho.adicionarCarta(carta3);
        baralho.adicionarCarta(carta4);
        baralho.adicionarCarta(carta5);

        baralho.imprimirBaralho();
        baralho.embaralharCartas();
        System.out.println("Baralho embaralhado!");
        baralho.imprimirBaralho();

    }
}