package exercicio2;

import java.math.BigDecimal;
import java.util.function.BiConsumer;

public class Programador extends Funcionario {
    private String linguagem;

    public Programador(String nome, Double salario, String linguagem) {
        super(nome,salario);
        this.linguagem = linguagem;
    }

    public void exibirInformacoes(){
        System.out.println("Programador");
        super.exibirInformacoes();
        System.out.println("Linguagem: " + linguagem);
    }
}
