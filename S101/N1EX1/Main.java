package S101.N1EX1;

public class Main {
    public static void main(String[] args) {
        Instrumento_viento flauta = new Instrumento_viento("Flauta",23);
        flauta.show();

        Instrumento_cuerda guitarra = new Instrumento_cuerda ("guitarra", 349.99);
        guitarra.show();

        Instrumento_percusion bateria = new Instrumento_percusion ("bateria", 724);
        bateria.show();

    }
}
