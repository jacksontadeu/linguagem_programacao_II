package edu.fatec.lp2.exercicio2;

import edu.fatec.lp2.exercicio2.model.ItemCompra;
import edu.fatec.lp2.exercicio2.model.ListaCompra;
import edu.fatec.lp2.exercicio2.model.Produto;
import edu.fatec.lp2.exercicio2.model.Supermercado;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Supermercado s = new Supermercado("Tabajara");
        Produto p = new Produto("Teste","640ml",20.00,2.00,s);
        Produto p1 = new Produto("Teste1","640ml",30.00,2.00,s);
        ItemCompra i = new ItemCompra(2,p, 2.00);
        ItemCompra i1 = new ItemCompra(2,p1, 1.00);
        i.calcularPreco();
        i1.calcularPreco();
        ListaCompra l = new ListaCompra(5);
        l.incluirItem(i);
        l.incluirItem(i1);
        System.out.println("Valor total da lista: "+ l.calcularPreco());
        System.out.println(i.toString());
        System.out.println(i1.toString());
        l.listar();;

    }
}