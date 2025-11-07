package edu.fatec.lp2.exercicio2.model;

public class Produto {
    private String nome;
    private String unidade;
    private Double preco;
    private Double descontoMaximo;
    private Supermercado supermercado;

    public Produto() {
    }

    public Produto(String nome, String unidade, Double preco, Double descontoMaximo, Supermercado supermercado) {
        this.nome = nome;
        this.unidade = unidade;
        this.preco = preco;
        this.descontoMaximo = descontoMaximo;
        this.supermercado = supermercado;
    }

    public Supermercado getSupermercado() {
        return supermercado;
    }

    public void setSupermercado(Supermercado supermercado) {
        this.supermercado = supermercado;
    }

    public Double getDescontoMaximo() {
        return descontoMaximo;
    }

    public void setDescontoMaximo(Double descontoMaximo) {
        this.descontoMaximo = descontoMaximo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
