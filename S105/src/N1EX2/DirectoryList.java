package N1EX2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class DirectoryList {

    public static void directory(String sDirectory) {
        File carpeta = new File(sDirectory);
        File[] archivos = carpeta.listFiles();
        ArrayList<File> listaArchivos = new ArrayList<File>(List.of(archivos));
        if (archivos == null || archivos.length == 0) {
            System.out.println("No hay elementos dentro de la carpeta actual");

        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            for (int i = 0; i < listaArchivos.size(); i++) {
                File archivo = listaArchivos.get(i);
                if(archivo.isDirectory()) {
                    System.out.println(String.format("%s (%s) - %d - %s",
                            archivo.getName(),
                            archivo.isDirectory() ? "D" : "F",
                            archivo.length(),
                            sdf.format(archivo.lastModified())
                    ));
                    directory(String.valueOf(archivo));
                }else{
                    System.out.println(String.format("%s (%s) - %d - %s",
                            archivo.getName(),
                            archivo.isDirectory() ? "D" : "F",
                            archivo.length(),
                            sdf.format(archivo.lastModified())));
                }

            }
        }
    }
}