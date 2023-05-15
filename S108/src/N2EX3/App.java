package N2EX3;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Operation operation = ()-> operation("/", (float) 1423.12, (float) 534.17);
        System.out.println(operation);
    }

    public static float operation(String operator, float n1, float n2) {

        float resultado=switch (operator){
            case "+" -> n1 + n2;
            case "-" -> n1 - n2;
            case "*" -> n1 * n2;
            case "/" -> n1 / n2;
            default -> throw new IllegalStateException("Unexpected value: " + operator );
        };
        return resultado;
    }

}
