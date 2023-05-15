package N2EX4;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> generalList = new ArrayList<>(List.of("Nombre","Edad","Nahuel","25","Jose Antonio","35","Pablo","22"));
        alphabetic(generalList);
        System.out.println("---------------------------------------------------------");
        containsE(generalList);
        System.out.println("---------------------------------------------------------");
        changingAfor4(generalList);
        System.out.println("---------------------------------------------------------");
        justNumber(generalList);
    }
    public static void alphabetic(List<String>generalList){
        generalList.stream().sorted().forEach(System.out::println);
    }
    public static void containsE(List<String>generalList){
        generalList.stream().filter(name -> name.toLowerCase().contains("e")).sorted().forEach(System.out::println);
        generalList.stream().filter(name -> !name.toLowerCase().contains("e")).sorted().forEach(System.out::println);
    }

    public static void changingAfor4(List<String>generalList){
        generalList.forEach(name-> System.out.println(name.replace('a','4')));
    }
    public static void justNumber(List<String>generalList){
        generalList.stream().filter(n -> n.matches("[0-9]*")).forEach(System.out::println);
    }
}
