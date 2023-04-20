package S102.N2EX1;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Entrada  {
    private static final Scanner input = new Scanner(System.in);


    public static byte leerByte(String message){
        byte tryout = 0;
        boolean filter = false;
        do{
            System.out.println(message);
            try{
                tryout = input.nextByte();
                filter = true;
            }catch(InputMismatchException e){
                System.out.println("Error introducing data");
                input.nextLine();
            }
        }while(!filter);
        return tryout;
    }

    public static int leerInt(String message){
        int tryout = 0;
        boolean filter = false;
        do{
            System.out.println(message);
            try{
                tryout = input.nextInt();
                filter = true;
            }catch(InputMismatchException e){
                System.out.println("Error introducing data");
                input.nextLine();
            }
        }while(!filter);

        return tryout;
    }
    public static float leerFloat(String message){
        float tryout = 0;
        boolean filter = false;
        do{
            System.out.println(message);
            try{
                tryout = input.nextFloat();
                filter = true;
            }catch(InputMismatchException e){
                System.out.println("Error introducing data");
                input.nextLine();
            }
        }while(!filter);

        return tryout;
    }
    public static double leerDouble(String message){
        double tryout = 0;
        boolean filter = false;
        do{
            System.out.println(message);
            try{
                tryout = input.nextDouble();
                filter = true;
            }catch(InputMismatchException e){
                System.out.println("Error introducing data");
                input.nextLine();
            }
        }while(!filter);

        return tryout;
    }

    public static String leerString(String message){
        String tryout = "";
        boolean filter = false;
        do {
            System.out.println(message);
            try {
                tryout = input.nextLine();
                filter = true;
            } catch (Exception e) {
                System.out.println("Error introducing the String");
            }
        }while(!filter);
        return tryout;
    }

    public static char leerChar(String message) {
        char tryout = 0;
        boolean filter = false;
        do {
            try {
                System.out.println(message);
                String tryout1 = input.nextLine();
                if (tryout1.length() < 2) {
                    tryout = tryout1.charAt(0);
                    filter = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Error introducing Char");
                input.nextLine();
            }
        }while (!filter) ;

        return tryout;
    }

    public static boolean leerBoolean(String message) {
        boolean tryout = false;
        boolean filter = false;
        do {
            try {
                System.out.println(message);
                String tryout1 = input.nextLine();
                if (tryout1.length() < 2) {
                    if (tryout1.charAt(0) == 's') {
                        tryout = true;
                        filter = true;
                    }
                    else if(tryout1.charAt(0) == 'n'){
                        tryout = false;
                        filter = true;
                    }else{
                        throw new Exception();
                    }
                } else{
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Error introducing the Boolean");
                input.nextLine();
            }
        }while (!filter) ;

        return tryout;
    }



}
