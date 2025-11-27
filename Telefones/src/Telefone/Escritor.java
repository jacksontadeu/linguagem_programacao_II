package Telefone;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Escritor {

    public void escreverDados(String destino, List<String> numeros) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(destino))) {
            int contador = 0;
            for(String num : numeros){
                String[] nums = (num.split(" "));
                for(String n: nums) {
                    Validador val = new Validador();
                    if(val.validarNumero(n)){
                        bw.write(n);
                        bw.newLine();
                        contador ++;
                    }
                }
            }
            bw.write("Total: " + contador);
            bw.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
