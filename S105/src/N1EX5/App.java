package N1EX5;


import java.io.*;

public class App {
    public static void main(String[] args) {

        Coche[] cocheList = new Coche[3];
        cocheList[0] = new Coche("Audi", "Rs7", 250);
        cocheList[1] = new Coche("Toyota", "Nsx", 270);
        cocheList[2] = new Coche("Bmw", "330", 220);
        serializarDeserializar(cocheList);


    }
    public static void serializarDeserializar (Coche[]listaCoches){
        try {
            ObjectOutputStream printLista = new ObjectOutputStream(new FileOutputStream("listaCoches.ser"));
            printLista.writeObject(listaCoches);
            printLista.close();

            ObjectInput deserializarLista = new ObjectInputStream(new FileInputStream("listaCoches.ser"));
           listaCoches = (Coche[]) deserializarLista.readObject();
           listaCoches.clone();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for(Coche c: listaCoches){
            System.out.println(c);
        }
    }
}
