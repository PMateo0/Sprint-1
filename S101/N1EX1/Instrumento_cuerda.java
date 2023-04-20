package S101.N1EX1;

public class Instrumento_cuerda extends Instrumento{
    public Instrumento_cuerda(String name, double price) {
        super(name, price);
    }

    public void show(){
        System.out.println("Esta sonando un instrumento de cuerda");
    }
}
