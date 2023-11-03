import java.util.Arrays;
import java.util.Map;

public class Cesta  {
    //private Producto [] listaProductos;

    private Map<Producto,Integer> mapaProductos;

    //Change Arraylist to Array


    public Cesta(Map<Producto, Integer> mapaProductos) {
        this.mapaProductos = mapaProductos;
    }


    public Map<Producto, Integer> getListaProductos() {
        return mapaProductos;
    }

    public void setListProductos(Map<Producto, Integer> mapaProductos) {
        this.mapaProductos = mapaProductos;
    }

    public double calcularImporteTotal(){
        double importeTotal = 0;
        for (Producto producto: mapaProductos.keySet()) {
            importeTotal += producto.getPrecio() * mapaProductos.get(producto);
        }
        return importeTotal;
    }

    public void addProducto(Producto producto, int cantidad) {
        if (existeProducto(producto)){
            System.out.println("El producto " + producto.getNombre() + " ya existe en la cesta" + " Incrementando la cantidad del producto" + producto.getNombre() + " en " + cantidad +" - unidades"+
            "- (Cantidad actual: " + mapaProductos.get(producto) + ")");
            mapaProductos.put(producto, mapaProductos.get(producto) + cantidad);
        }else{
            mapaProductos.put(producto, cantidad);
        }
    }

    public void eliminarProducto(Producto producto) throws NullPointerException {
        if (existeProducto(producto)){
            System.out.println("Eliminando producto " + producto.getNombre() + " de la cesta");
            mapaProductos.remove(producto);
        }else{
            throw new NullPointerException("El producto" + producto.getNombre() + "no existe en la cesta");
        }
    }
    public void incrementarCantidadProducto(Producto producto, int cantidad ) throws NullPointerException {
        if (existeProducto(producto)) {
            System.out.println("Incrementando la cantidad del producto " + producto.getNombre() + " en " + cantidad + " unidades" +
                    " (Cantidad actual: " + mapaProductos.get(producto) + ")");
            mapaProductos.put(producto, mapaProductos.get(producto) + cantidad);

        }else {
            throw new NullPointerException("El producto" + producto.getNombre() + "no existe en la cesta");
        }
    }



    private boolean existeProducto(Producto producto){
        return mapaProductos.containsKey(producto);
    }

    public void disminuirCantidadProducto(Producto producto, int cantidad ) throws NullPointerException{
        if (existeProducto(producto)) {
            System.out.println("Disminuyendo la cantidad del producto " + producto.getNombre() + " - (Cantidad actual igual o inferior a 0)");
            mapaProductos.put(producto, mapaProductos.get(producto) - cantidad);

            if (mapaProductos.get(producto) <= 0) {
                System.out.println("Eliminando el producto " + producto.getNombre());
                mapaProductos.remove(producto);
            }
        }
        else {
            throw new NullPointerException("El producto " + producto.getNombre() + " no existe en la cesta");
        }

    }
    @Override
    public String toString() {
        return "Cesta{" +
                "mapaProductos=" + mapaProductos +
                '}';
    }
}
