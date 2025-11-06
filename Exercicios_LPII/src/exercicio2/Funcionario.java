package exercicio2;

import java.math.BigDecimal;

public class Funcionario {

    private String nome;
    private Double salario;

    public Funcionario(String nome, Double salario) {
        this.nome= nome;
        this.salario=salario;
    }




    public void exibirInformacoes() {
        System.out.println("Funcionario");
        System.out.println("nome: "+ nome);
        System.out.println("Salario: "+salario);
    }
}
