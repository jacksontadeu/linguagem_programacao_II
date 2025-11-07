package edu.fatec.lp2.exercicio2.model;

public class ItemCompra implements  Calculavel {

    private Integer quantidade;
    private Produto produto;
    private Double desconto;

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
        return 0;
    }
}
