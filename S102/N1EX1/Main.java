package S102.N1EX1;

public class Main {
    public static void main(String[] args) {
        Venta venta = new Venta();
        Producto producto1 = new Producto("Ordenador", 865);
        Producto producto2 = new Producto("Ordenador", 823);
        Producto producto3 = new Producto("Ordenador", 536);
        Producto producto4 = new Producto("Ordenador", 1256);
        venta.addProduct(producto1);venta.addProduct(producto2);venta.addProduct(producto3);venta.addProduct(producto4);

        venta.calculoTotal();
    }

}
