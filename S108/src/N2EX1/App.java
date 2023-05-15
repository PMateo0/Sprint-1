package N2EX1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> cadenas = new ArrayList<>(List.of("fdger","Amy","Alameda","Alfa","Bravo","Charlie","Delta","Epsilon","Foxtrot","Asd","Apl"));
        cadenas.stream().filter(cadena->cadena.startsWith("A")&& cadena.length()==3).forEach(System.out::println);
    }
}
