public class Producto {
    int precioUnitario;
    String nombreDeProducto;

    //SETTER
    public void producto(int precio,String nombre){
        this.precioUnitario = precio;
        this.nombreDeProducto = nombre;
    }

    // GETTER

    public int getPrecio(){
        return this.precioUnitario;
    }
    public String getNombre(){
        return this.nombreDeProducto;
    }


}
