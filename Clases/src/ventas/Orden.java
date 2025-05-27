package ventas;

public class Orden {
    private final int idOrden;
    private Producto[] productos;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    private static int contadorOrdenes;

    public Orden()
    {
        this.idOrden=++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto){
        if(this.contadorProductos < Orden.MAX_PRODUCTOS)
            this.productos[this.contadorProductos++] = producto;
        else
            System.out.println("Se ha superado el maximo de productos: " + Orden.MAX_PRODUCTOS);
    }

    public double calculaTotal(){
        double total = 0;
        for (var i=0; i < this.contadorProductos; i++){
            var producto = this.productos[i];
            total += producto.getPrecio();
        }
        return total;
    }

    public void mostrarOrden(){
        System.out.println("Id Orden " + this.idOrden);
        var totalOrden = this.calculaTotal();
        System.out.println("\tTotal de la Orden: $" + totalOrden);
        System.out.println("\tproductos de la orden: ");
        for(var i = 0; i< this.contadorProductos;i++)
            System.out.println("\t\t" + this.productos[i]);
    }
}
