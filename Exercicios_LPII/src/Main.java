import exercicio5.Carro;
import exercicio5.TesteVeiculo;
import exercicio5.Veiculo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        double res = calcular(10, 1.5);
        System.out.println(res);

    }


    public static double calcular(int a, double b) {
        int contador =0;
        double soma = 0;
        do{
            if (a == 1) {
                return b;
            }else{
                contador++;
               soma =soma+b;

            }

        }while(contador != a);
        return soma;
    }
}