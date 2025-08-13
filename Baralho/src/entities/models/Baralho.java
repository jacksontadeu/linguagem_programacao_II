package entities.models;

import java.util.Arrays;

public class Baralho {
    private Carta[] cartas;
    private int tamanho;

    public Baralho() {
        this.cartas = new Carta[52];
        this.tamanho = 0;
    }
    public int getTamanho() {
        return tamanho;
    }

    public void adicionarCarta(Carta carta) {
        if (tamanho < cartas.length) {
            cartas[tamanho] = carta;
            tamanho++;
        } else {
            System.out.println("Baralho cheio!");
        }
    }

    public Carta distribuirCarta() {
        if (tamanho > 0) {
            Carta carta = cartas[tamanho - 1];
            cartas[tamanho - 1] = null;
            tamanho--;
            return carta;
        } else {
            System.out.println("Baralho vazio!");
            return null;
        }
    }
    public Boolean hasCarta(){
        if (tamanho > 0) {
            return true;
        } else {
            return false;
        }
    }
    public void imprimirBaralho(){
        for (Carta carta : cartas) {
            if (carta != null) {
                System.out.println(carta);
            }
        }
    }



    @Override
    public String toString() {
        return "Baralho"
                 + Arrays.toString(cartas);

    }
}
