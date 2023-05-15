package N1EX6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String>cadenas= new ArrayList<>(List.of("sdfkljgns","kdjlasdkjf","llclnzxc","mzxcv","vcmbkl","sdfughfu","nm"));
        cadenas.sort( (a,b)-> a.length() - b.length());
        cadenas.forEach(System.out::println);
    }

}
