package br.edu.fatec.factory.models;

import br.edu.fatec.factory.interfaces.Calculable;

public class Circle implements Calculable {


    private double radius;
    private final double PI = 3.14159;

    public Circle(Double[] values) {
        this.radius = values[0];
    }
    @Override
    public double calculateArea() {
        return (radius * radius) * PI;
    }
}
