package br.edu.fatec.factory.models;

import br.edu.fatec.factory.interfaces.Calculable;

public class Square implements Calculable {
    private double side;

    public Square(Double[] values) {
        this.side = values[0];
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
