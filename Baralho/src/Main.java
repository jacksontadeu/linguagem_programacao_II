import entities.enums.Naipe;
import entities.models.Baralho;
import entities.models.Carta;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carta carta1 = new Carta("Ás", Naipe.OURO);
        Carta carta2 = new Carta("Rei", Naipe.ESPADAS);

        Baralho baralho = new Baralho();
        baralho.adicionarCarta(carta1);
        baralho.adicionarCarta(carta2);

        baralho.imprimirBaralho();

    }
}