package exercicio4;

public class ProdutoEletronico extends Produto {

    public ProdutoEletronico(String nome, double preco){
        super(nome,preco);
    }

    public double calcularPrecoFinal(){
        return this.preco * 0.9;
    }
}
