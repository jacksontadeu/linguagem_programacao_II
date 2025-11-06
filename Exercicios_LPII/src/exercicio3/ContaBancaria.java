package exercicio3;

public class ContaBancaria {
    protected Double saldo;

    public ContaBancaria(double saldo) {
        this.saldo =saldo;
    }

    public void sacar(double valor){
        if (valor <= saldo){
            this.saldo = saldo - valor;
        }else{
            System.out.println("Saldo indisponivel");
        }
    }
    public void depositar(double valor){
        if(valor > 0){
            this.saldo = saldo + valor;
        }
        else{
            System.out.println("Valor invalido");
        }

    }

    public Double getSaldo() {
        return saldo;
    }
}
