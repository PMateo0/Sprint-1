package N2EX2;

import java.util.Arrays;

public class GenericMethods<T>{
    public static <T> void print (T...args){
        for(T arg:args){
            System.out.println(arg);
        }

    }



}
