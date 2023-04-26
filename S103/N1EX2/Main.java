package S103.N1EX2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        List<Integer> listaInvertida = new ArrayList<>();
        ListIterator<Integer> it = numeros.listIterator();

        while (it.hasNext()) {
           it.next();
        }

        while(it.hasPrevious()){
            listaInvertida.add(it.previous());
        }
        System.out.println(listaInvertida);

    }

}
