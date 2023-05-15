package N2EX2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(3,5,4,46,6,3,4,6,32));
        System.out.println(filter(numbers));

    }

    public static String filter(List<Integer>numbers){
     return   numbers.stream().map(number->{

            if(number%2 == 0){
                return "e"+number;
            }else{
                return "o"+number;
            }

        }).collect(Collectors.joining(", "));
    }
}
