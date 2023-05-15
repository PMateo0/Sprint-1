package N1EX8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        Reverse reverse= (String)-> new StringBuilder(String).reverse().toString();
        System.out.println(reverse.reverse("JosephAnthony"));

    }

}
