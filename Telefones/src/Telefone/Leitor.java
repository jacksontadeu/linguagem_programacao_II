package Telefone;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leitor {

    List<String> telefones = new ArrayList<>();

    public void receberDados(String origem) throws IOException {
        String linha;
        FileReader fr = new FileReader(origem);
        BufferedReader buffer = new BufferedReader(fr);


        while ((linha = buffer.readLine()) != null) {
            telefones.add(linha);

        }
        for (String tel : telefones) {
            Escritor e = new Escritor();
            e.escreverDados("src/destino.txt",telefones );
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Leitor{");
        sb.append("telefones=").append(telefones);
        sb.append('}');
        return sb.toString();
    }
}
