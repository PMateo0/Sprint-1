package N1EX7;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> cadenas= new ArrayList<>(List.of("sdfkljgns","kdjlasdkjf","llclnzxc","mzxcv","vcmbkl","sdfughfu","nm"));
        cadenas.sort((a,b)->b.length()-a.length());
        cadenas.forEach(System.out::println);
    }
}
