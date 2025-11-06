package exercicio7;

import java.util.ArrayList;
import java.util.List;

public class TesteAnimal {
    public static void main(String[] args) {
        List<Animal> animais =  new ArrayList<>();
        animais.add(new Gato());
        animais.add(new Cachorro());
        animais.add(new Pato());
        animais.add(new Gato());
        animais.add(new Cachorro());
        animais.add(new Pato());

        for(var item: animais){
           item.fazerBarulho();
        }

    }
}
