package S101.N1EX1;

public class Instrumento_viento extends Instrumento {
    public Instrumento_viento(String name, double price) {
        super(name, price);
    }

    public void show(){
        System.out.println ("Esta sonando un instrumento de viento");
    }
}
