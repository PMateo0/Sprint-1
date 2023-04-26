package S103.N1EX3;
import java.io.*;
import java.util.*;



public class IntroFile {

    public static HashMap readFile() {

        HashMap<String, String> countries = new HashMap<String, String>();
        BufferedReader mybuffer = null;
        String linea;

        try {
            mybuffer = new BufferedReader(new FileReader("C:\\Users\\formacio\\Desktop\\Java\\Sprint 1\\src\\S103\\N1EX3\\countries.txt"));

            while ((linea = mybuffer.readLine()) != null) {
                StringTokenizer words = new StringTokenizer(linea);

                while (words.hasMoreElements()) {
                    countries.put(words.nextToken().toString(), words.nextToken().toString());
                }

            }
        } catch (Exception e) {
            System.out.println("Error founding files");
        } finally {
            try {
                if (mybuffer != null) {
                    mybuffer.close();
                }
            } catch (Exception e) {
                    System.out.println("Error closing the file");
            }
        }
        return countries;
    }

    public static void createFile(String name, int nota){
        try{
            PrintWriter writer  =  new PrintWriter("classificacio.txt");
            writer.println("El nombre del jugador es: " + name + " puntuación: " + nota);
            writer.close();
        } catch (IOException e) {
            System.out.println("Error creating files");
        }
    }
}