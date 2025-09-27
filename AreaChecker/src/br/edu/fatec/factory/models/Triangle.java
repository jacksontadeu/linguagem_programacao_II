package br.edu.fatec.factory.models;

import br.edu.fatec.factory.interfaces.Calculable;

public class Triangle implements Calculable {
    private double base;
    private double height;

    public Triangle(Double[] values) {
        this.base = values[0];
        this.height = values[1];
    }
    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }
}
