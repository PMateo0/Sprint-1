package S101.N2EX1;

public class Telefono {

    protected String marca;
    protected String modelo;


    public Telefono (String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public static void llamar(String numero){
        System.out.println("Se esta llamando al número " + numero);
    }


}
