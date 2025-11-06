package exercicio3;

public class ContaCorrente extends ContaBancaria{
    private double taxa ;

    public ContaCorrente(double saldo) {
        super(saldo);
        this.taxa = 5;
    }

    public void sacar(double valor){
        if (valor <= (super.saldo + this.taxa)){
            this.saldo = saldo - (valor + taxa);
        }
        else{
            System.out.println("Saldo indisponivel");
        }
    }


}
