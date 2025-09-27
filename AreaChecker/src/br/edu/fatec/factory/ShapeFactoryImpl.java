package br.edu.fatec.factory;

import br.edu.fatec.factory.enums.ShapeType;
import br.edu.fatec.factory.interfaces.Calculable;
import br.edu.fatec.factory.interfaces.ShapeFactory;
import br.edu.fatec.factory.models.Square;

public class ShapeFactoryImpl implements ShapeFactory{


    @Override
    public Calculable getShape(ShapeType shapeType, Double[] values) {
        switch(shapeType){
            case SQUARE:
                return new Square(values);

            default:
                 throw new IllegalArgumentException("Shape not found " + shapeType );
        }

    }
}
