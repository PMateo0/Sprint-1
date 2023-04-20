package S101.N1EX1;


public class Instrumento_percusion extends Instrumento {
    public Instrumento_percusion(String name, double price) {
        super(name, price);
    }

    public void show(){
        System.out.println("Esta sonando un instrumento de percusión");
    }

}
