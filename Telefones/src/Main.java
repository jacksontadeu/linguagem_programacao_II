import Telefone.Escritor;
import Telefone.Leitor;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        Leitor l = new Leitor();
        try {
            l.receberDados("src/telefones.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



}