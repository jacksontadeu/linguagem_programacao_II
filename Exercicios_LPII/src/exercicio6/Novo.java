package exercicio6;

public class Novo extends Imovel{
    private double valorAdicional;

    public Novo(String endereco, double preco, double valorAdicional) {
        super(endereco, preco);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public double imprimirPreco() {
        return this.preco + this.valorAdicional;
    }
}
