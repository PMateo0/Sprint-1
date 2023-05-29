package S103.N2EX1;

import java.util.HashSet;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {

        HashSet<Restaurant> rSet = new HashSet<>();

            rSet.add(new Restaurant("Kebab Ali",8));
            rSet.add(new Restaurant( "Kebab Ali",6));
            rSet.add(new Restaurant("Kebab Ali",10));

        TreeSet<Restaurant>e = new TreeSet<>(rSet);
        System.out.println(e);


    }


}
