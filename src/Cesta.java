import java.util.Arrays;

public class Cesta  {
    private Producto [] listaProductos;

    public Cesta(Producto[] listaProductos) {
        this.listaProductos = listaProductos;
    }

    public Producto[] getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(Producto[] listaProductos) {
        this.listaProductos = listaProductos;
    }

    public double calcularImporteTotal(){
        double importeTotal = 0;
        for (Producto producto : listaProductos) {
            importeTotal += producto.getPrecio();
        }
        return importeTotal;
    }

    @Override
    public String toString() {
        return "Cesta{" +
                "listaProductos=" + Arrays.toString(listaProductos) +
                '}';
    }
}
