package exercicio6;

public class Velho extends Imovel{

    private double desconto;

    public Velho(String endereco, double preco, double desconto) {
        super(endereco, preco);
        this.desconto = desconto;
    }

    @Override
    public double imprimirPreco() {
        return this.preco - this.desconto;
    }
}
