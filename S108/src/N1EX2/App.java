package N1EX2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class App {

    public static void main(String[] args) {

        List<String> listaCadenas = new ArrayList<>(List.of("Rafael","Leonardo","Michelangelo","Donatello","Splinter","Shredder","rojo","uno","ooooooooooo"));
        String letter = "o";
        List<String>finalList = filterList1(listaCadenas,letter);
        System.out.println(finalList);
    }

    public static List<String > filterList1(List<String> originalList, String letter){

        return originalList.stream()
                .filter(s -> s.length()>=5 && s.contains(letter))
                .collect(Collectors.toList());
    }
}
