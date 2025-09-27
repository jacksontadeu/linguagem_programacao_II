package br.ed.fatec.main;

import br.edu.fatec.factory.ShapeFactoryImpl;
import br.edu.fatec.factory.enums.ShapeType;
import br.edu.fatec.factory.interfaces.ShapeFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactoryImpl();


        System.out.println("Square " + factory.getShape(ShapeType.SQUARE, new Double[]{2.0}).calculateArea());
    }
}