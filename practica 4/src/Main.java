
public class Main {
    public static void main(String[] args){
        Carrito carrito1= new Carrito();

        Producto jabonEnPolvo = new Producto();
        Producto esponjas = new Producto();
        Producto chocolates = new Producto();

        jabonEnPolvo.producto(40, "jabon en polvo");
        esponjas.producto(10, "esponjas");
        chocolates.producto(100, "chocolates");

        carrito1.agregarProductoAlCarrito(jabonEnPolvo);
        carrito1.agregarProductoAlCarrito(esponjas);
        carrito1.agregarProductoAlCarrito(chocolates);


        System.out.println(carrito1.precio());

    }
}



