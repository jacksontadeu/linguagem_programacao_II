package edu.fatec.lp2.exercicio2.model;

import java.util.HashSet;
import java.util.Set;

public class ItemCompra implements  Calculavel {

    private Integer quantidade;
    private Produto produto;
    private Double desconto;

    public ItemCompra(Integer quantidade, Produto produto, Double desconto) {
        this.quantidade = quantidade;
        this.produto = produto;
        this.desconto = desconto;
    }

    public ItemCompra() {

    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    @Override
    public double calcularPreco() {
        if (this.desconto > this.produto.getDescontoMaximo()){
            System.out.println("Desconto maior que o permitido");
            return this.produto.getPreco();
        }else{
            this.produto.setPreco(this.produto.getPreco() - this.getDesconto());
            return this.produto.getPreco();
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ItemCompra{");
        sb.append("quantidade=").append(quantidade);
        sb.append(", produto=").append(produto.getNome());
        sb.append(", produto=").append(produto.getPreco());
        sb.append(", desconto=").append(desconto);
        sb.append('}');
        return sb.toString();
    }
}
