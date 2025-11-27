package Telefone;

public class Validador {

    public Boolean validarNumero(String numero) {
        String[] numeros = numero.split("");
        int[] vetor = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            vetor[i] = Integer.parseInt(numeros[i]);
        }

        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }


        if (soma % 2 == 0) {
            return false;
        }


        if (vetor[0] == vetor[vetor.length - 1]) {
            return false;
        }


        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] == vetor[i + 1]) {
                return false;
            }
        }

        return true;
    }

}
