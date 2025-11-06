package exercicio4;

public class ProdutoRoupa extends Produto{

    public ProdutoRoupa(String nome, double preco){
        super(nome,preco);
    }

    @Override
    public double calcularPrecoFinal() {
        return this.preco * 0.8;
    }
}
