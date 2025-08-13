package entities.models;

import entities.enums.Naipe;

public class Carta {
    private String nome;
    private Naipe naipe;

    public Carta(String nome, Naipe naipe) {
        this.nome = nome;
        this.naipe = naipe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    @Override
    public String toString() {
        return nome + " " + naipe;

    }
}
