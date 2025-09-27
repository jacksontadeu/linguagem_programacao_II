package br.edu.fatec.factory.models;

import br.edu.fatec.factory.interfaces.Calculable;

public class Rectangle implements Calculable {

    private double width;
    private double height;
    public Rectangle(Double[] values) {
        this.width = values[0];
        this.height = values[1];
    }
    @Override
    public double calculateArea() {
        return width * height;
    }
}
