package S102.N1EX1;

public class Producto {
    protected String nombre;
    protected int precio;

    public Producto (String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
