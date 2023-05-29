package N1EX3;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;


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
                    writeFile(String.format("%s (%s) - %d - %s",
                            archivo.getName(),
                            archivo.isDirectory() ? "D" : "F",
                            archivo.length(),
                            sdf.format(archivo.lastModified())
                    ));
                    directory(String.valueOf(archivo));
                }else{
                    writeFile(String.format("%s (%s) - %d - %s",
                            archivo.getName(),
                            archivo.isDirectory() ? "D" : "F",
                            archivo.length(),
                            sdf.format(archivo.lastModified())));
                }

            }
        }
    }

    public static void writeFile(String print){
        try{
            FileWriter directoryWriter = new FileWriter("directory.txt",true);
            PrintWriter pw = new PrintWriter(directoryWriter);
            pw.println(print);
            pw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}