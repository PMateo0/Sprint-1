package N1EX1;

public class App {
    public static void main(String[] args) {

      NoGenericMethods noGenericMethods = new  NoGenericMethods(1,2,3);

      System.out.println(noGenericMethods.getNum1()+""+ noGenericMethods.getNum2()+""+ noGenericMethods.getNum3());

      NoGenericMethods noGenericMethods1 = new NoGenericMethods(3,2,1);

        System.out.println(noGenericMethods1.getNum1()+""+ noGenericMethods1.getNum2()+""+ noGenericMethods1.getNum3());
    }
}
