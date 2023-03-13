import java.util.ArrayList;
public class Carrito {

    int precioTotal = 0;

    ArrayList<Producto> productos = new ArrayList();

    //method
    public int precio() {
        for (int i = 0; i < productos.size(); i++) {
            precioTotal += productos.get(i).precioUnitario;
        }
        return precioTotal;
    }

    public void agregarProductoAlCarrito(Producto producto) {
        if (productos.size() < 3) {
            productos.add(producto);
        }
    }
}