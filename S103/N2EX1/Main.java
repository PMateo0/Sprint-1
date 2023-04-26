package S103.N2EX1;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {

        HashSet<Restaurant> rSet = new HashSet<>();

            rSet.add(new Restaurant("Kebab Ali",8));
            rSet.add(new Restaurant( "Kebab Ali",6));
            rSet.add(new Restaurant("Kebab Ali",10));


            for(Restaurant restaurant:rSet){
                System.out.println("El nombre del restaurante es: " + restaurant.getName() + " y su puntuación: " + restaurant.getPunctuation());
            }


    }


}
