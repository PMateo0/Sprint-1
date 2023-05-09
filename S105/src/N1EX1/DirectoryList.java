package N1EX1;

import java.io.File;
import java.util.*;

public class DirectoryList {


    public static void directory(String sDirectory) {

        File directory = new File(String.valueOf(sDirectory));
        String[] fileList1 = directory.list();

        if (directory.exists()) {

            Arrays.sort(fileList1);
            for (String listado : fileList1) {
                System.out.println(listado);
            }
        } else {
            System.out.println("Error loading the directory");
        }

    }
}
