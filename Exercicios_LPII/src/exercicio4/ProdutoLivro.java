package exercicio4;

public class ProdutoLivro extends Produto{

    public ProdutoLivro(String nome, double preco){
        super(nome,preco);
    }

    @Override
    public double calcularPrecoFinal() {
        return this.preco;
    }
}
