package S103.N1EX3;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        String name = Entrada.leerString("Introduce el nombre del jugador");
        int puntuacion = 0;

        HashMap countries = IntroFile.readFile();


        for(int contador = 0; contador <10; contador++){

            Object [] countrylist = countries.keySet().toArray();
            Object country = countrylist [new Random().nextInt(countrylist.length)];

            String capital = Entrada.leerString("Cual es la capital de: " + country);

            if(capital.equalsIgnoreCase(countries.get(country).toString())){
                puntuacion++;
            }
        }
        IntroFile.createFile(name,puntuacion);


    }



}
