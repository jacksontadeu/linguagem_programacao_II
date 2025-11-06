package exercicio6;

public class Imovel {
    protected String endereco;
    protected double preco;

    public Imovel(String endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    public double imprimirPreco(){
        return this.preco;
    }
}
