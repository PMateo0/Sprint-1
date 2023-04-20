package S101.N1EX2;


public class Coche {

    protected static final String marca = "Dodge";
    protected static String modelo = "Challenger";
    protected final int power;

    public Coche (int power){

        this.power = power;
    }

    void acelerar(){

        System.out.println("El coche esta acelerando");
    }

    public static void frenar(){

        System.out.println("El coche esta frenando");
    }

}
