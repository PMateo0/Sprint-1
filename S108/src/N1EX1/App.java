package N1EX1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class App {

    public static void main(String[] args) {

        List<String> listaCadenas = new ArrayList<>(List.of("Rafael","Leonardo","Michelangelo","Donatello","Splinter","Shredder"));
        String letter = "o";
        List<String>finalList = filterList1(listaCadenas,letter);
        System.out.println(finalList);
    }

    public static List<String > filterList1(List<String> originalList, String letter){

        return originalList.stream()
                .filter(s -> s.contains(letter))
                .collect(Collectors.toList());
    }
}
