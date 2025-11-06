package exercicio3;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(double saldo) {
        super(saldo);
    }
    public void renderJuros(){
        this.saldo = saldo + (saldo * 0.01);

    }
    public void sacar(double valor){
        if (valor <= saldo){
            this.saldo = saldo -valor;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    public void depositar(double valor){
        if(valor > 0){
            this.saldo =saldo + valor;
        }else{
            System.out.println("Valor invalido");
        }
    }
}
