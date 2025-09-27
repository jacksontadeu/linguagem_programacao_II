package br.edu.fatec.factory.interfaces;

import br.edu.fatec.factory.enums.ShapeType;

public interface ShapeFactory {
    Calculable getShape(ShapeType shapeType, Double[] values);
}
