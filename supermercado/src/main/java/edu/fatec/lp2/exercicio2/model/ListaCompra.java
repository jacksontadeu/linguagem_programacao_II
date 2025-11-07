package edu.fatec.lp2.exercicio2.model;

import java.util.ArrayList;
import java.util.List;

public class ListaCompra implements Calculavel {

    private Integer qtdeMax;
    List<ItemCompra> itensCompra ;

    public ListaCompra(List<ItemCompra> itensCompra)  {
        this.itensCompra = new ArrayList<>();
    }

    public void incluirItem(ItemCompra item){
        itensCompra.add(item);
    }

    @Override
    public double calcularPreco() {
        return 0;
    }
}
