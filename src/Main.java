import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


       Cesta cesta = new Cesta(new Producto[]{
                new Bebida("Coca Cola", "Refresco de cola", 1.5, LocalDate.of(2024, 10, 20), 0.33),
                new Bebida("Fanta", "Refresco de naranja", 1.5, LocalDate.of(2024, 10, 4), 0.33),
               new Ropa("Camiseta", "Camiseta de manga corta", 10, "Camiseta", "M"),
               new Ropa("Pantalón", "Pantalón vaquero", 20, "Pantalón", "M"),
                new Comida("Manzana", "Manzana Golden", 1, LocalDate.of(2024, 5, 21), 0.2),
                new Comida("Plátano", "Plátano de Canarias", 1, LocalDate.of(2024, 4, 2), 0.2),



        });

       Cesta cesta2 = new Cesta(new Producto[]{
               new Bebida("Coca Cola", "Refresco de cola", 1.5, LocalDate.of(2024, 10, 20), 0.33),
               new Bebida("Fanta", "Refresco de naranja", 1.5, LocalDate.of(2024, 10, 4), 0.33),
               new Ropa("Camiseta", "Camiseta de manga corta", 10, "Camiseta", "M"),
               new Ropa("Pantalón", "Pantalón vaquero", 20, "Pantalón", "M"),
               new Comida("Manzana", "Manzana Golden", 1, LocalDate.of(2024, 5, 21), 0.2),
               new Comida("Plátano", "Plátano de Canarias", 1, LocalDate.of(2024, 4, 2), 0.2),
               new Bebida("Coca Cola", "Refresco de cola", 1.5, LocalDate.of(2024, 10, 20), 0.33),
               new Bebida("Fanta", "Refresco de naranja", 1.5, LocalDate.of(2024, 10, 4), 0.33),
               new Ropa("Camiseta", "Camiseta de manga corta", 10, "Camiseta", "M"),
               new Ropa("Pantalón", "Pantalón vaquero", 20, "Pantalón", "M"),


       });

        Cliente cliente1 = new Cliente("Pepe", cesta);
        System.out.println("====================================");
        System.out.println(cliente1.getNombre());
        System.out.println(cliente1.getCesta().calcularImporteTotal());
        System.out.println(cliente1.getCesta().getListaProductos().length);
        System.out.println(cliente1.getCesta().getListaProductos()[0].getNombre());

        Cliente cliente2 = new Cliente("Juan", cesta2);

        System.out.println("====================================");
        System.out.println(cliente2.getNombre());
        System.out.println(cliente2.getCesta().calcularImporteTotal());
        System.out.println(cliente2.getCesta().getListaProductos().length);
        System.out.println(cliente2.getCesta().getListaProductos()[0].getNombre());

        System.out.println(cliente2.getId());
    }
}
