package S102.N1EX1;
import java.util.ArrayList;

public class Venta {
    protected ArrayList<Producto> listaProducto;
    protected double precioVenta;

    public Venta() {
        listaProducto = new ArrayList<Producto>();

    }

    public void addProduct(Producto producto) {
        listaProducto.add(producto);
    }


    public void calculo() {
           if (listaProducto.size() == 0) {
               throw new VentaVaciaExcepcion();
           } else {
               for (Producto producto : listaProducto) {
                   precioVenta += producto.getPrecio();
               }
               System.out.println("The price of the entire sale is " + precioVenta);
           }
    }

    public void calculoTotal (){
        try{
            calculo();
        }catch(VentaVaciaExcepcion e){
            System.out.println("No exixting products in sales queue");
        }
    }

}
