package N2EX1;

import java.util.Arrays;

public class GenericMethods<T>{

    public static <T> void print (Persona persona, T element2, T element3){
        System.out.println(persona.toString() + " " + element2 + " " + element3);

    }



}
