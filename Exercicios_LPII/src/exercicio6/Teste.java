package exercicio6;

public class Teste {
    public static void main(String[] args) {
        Imovel novo = new Novo("Rua a", 10000, 1000);
        System.out.println( novo.imprimirPreco());
        Imovel velho = new Velho("Rua b", 10000, 1000);
        System.out.println(velho.imprimirPreco());
    }
}
