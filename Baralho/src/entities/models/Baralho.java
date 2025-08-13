package entities.models;

import java.util.Arrays;

public class Baralho {
    private Carta[] cartas;
    private int tamanho;

    public Baralho() {
        this.cartas = new Carta[52];
        this.tamanho = 0;
    }

    public void adicionarCarta(Carta carta) {
        if (tamanho < cartas.length) {
            cartas[tamanho] = carta;
            tamanho++;
        } else {
            System.out.println("Baralho cheio!");
        }
    }

    public Carta removerCarta() {
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

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return "Baralho{" +
                "cartas=" + Arrays.toString(cartas) +
                ", tamanho=" + tamanho +
                '}';
    }
}
