package N1EX3;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> months= new ArrayList<>(List.of("January","February","March","April","May","June","July","August","September","October","November","December"));
        months.stream().forEach(x -> System.out.println(x));
    }
}
