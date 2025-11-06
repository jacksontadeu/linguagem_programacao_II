package exercicio2;

import java.math.BigDecimal;

public class Gerente extends Funcionario {

    private String departamento;

    public Gerente(String nome, Double salario,String departamento) {
        super(nome,salario);
        this.departamento = departamento;
    }
   public void exibirInformacoes(){
       System.out.println("Gerente");
       super.exibirInformacoes();
       System.out.println("Departamento: " + departamento);
   }
}
