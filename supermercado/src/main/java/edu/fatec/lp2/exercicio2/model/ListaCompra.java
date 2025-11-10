package edu.fatec.lp2.exercicio2.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListaCompra implements Calculavel {

    private Integer qtdeMax;
    Set<ItemCompra> itensCompra ;

    public ListaCompra(Integer qtdeMax)  {
        this.qtdeMax = qtdeMax;
        this.itensCompra = new HashSet<>();
    }

    public void incluirItem(ItemCompra item){
        if(itensCompra.size() <= this.qtdeMax){
            itensCompra.add(item);
        }else{
            System.out.println("Quantidade máxima da lista excedida");
        }

    }

    @Override
    public double calcularPreco() {
        double valorTotal = 0;
        for(ItemCompra item : itensCompra){
            valorTotal = valorTotal + (item.getQuantidade() * item.getProduto().getPreco());
        }
        return valorTotal;
    }
    public void listar(){
        for(var item : this.itensCompra){
            System.out.println(item);
        }
    }
}
