package N1EX4;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> months= new ArrayList<>(List.of("January","February","March","April","May","June","July","August","September","October","November","December"));
        printList(months);
    }
    public static void printList(List<String>months){
        months.forEach(System.out::println);
    }
}
