import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    static Producto cocacolaLight = new Bebida("Cocacola Light", "Bebida a base de extracto de cola", 1.5, LocalDate.now().plus(3, ChronoUnit.MONTHS),32);
    static Producto fantaNaranja =  new Bebida("Fanta", "Refresco de naranja", 1.5, LocalDate.now().plus(3,ChronoUnit.MONTHS), 0.33);

    static Producto camiseta = new Ropa("Camiseta", "Camiseta de manga corta", 10, "Camiseta", "M");
    static Producto kitKat = new Comida("KitKat", "Barquillo bañado en chocolate, pack de 6", 2.5, LocalDate.now().plus(6, ChronoUnit.MONTHS),110);
    static Producto levis501 = new Ropa("Levis 501", "Pantalon vaquero de hombre", 139.99, "Pantalones", "46");
    static Producto huesitos = new Comida("Huesitos", "Barquillo bañado en chocolate, pack de 6", 2.5, LocalDate.now().plus(6, ChronoUnit.MONTHS),100);
    static Producto bufanda = new Ropa("Bufanda", "Bufanda de lana pura de oveja australiana", 35.75, "Ropa de abrigo", "Talla Unica");

    public static void main(String[] args) {


        Cliente cliente1 = crearCliente1();
        Cliente cliente2 = crearCliente2();

        procesarCestaCliente(cliente1);
        procesarCestaCliente(cliente2);

    }




    public static void procesarCestaCliente(Cliente cliente){
        System.out.println("***********************************************************");
        System.out.println("Cliente: " + cliente.getNombre());

        System.out.println("Contenido de la cesta del cliente: ");

        Set<Map.Entry<Producto, Integer>> entradasMapa = cliente.getCesta().getListaProductos().entrySet();

        entradasMapa.forEach(entrada -> System.out.println("***********************************************************\n" +
                "Producto: " + entrada.getKey() + " - Cantidad: " + entrada.getValue()));


        System.out.println("***********************************************************");
        System.out.println("Importe total de la cesta: " + cliente.getCesta().calcularImporteTotal() + " €");
        System.out.println("***********************************************************");

    }


    public static Cliente crearCliente1(){

        Map<Producto, Integer> mapaProductosCliente = new HashMap<>();
        mapaProductosCliente.put(bufanda, 1);
        mapaProductosCliente.put(cocacolaLight, 6);
        mapaProductosCliente.put(huesitos, 6);
        mapaProductosCliente.put(camiseta, 2);


        Cesta cestaCliente = new Cesta(mapaProductosCliente);

        return new Cliente("Aldo Santa María", cestaCliente);
    }


    public static Cliente crearCliente2(){

        Map<Producto, Integer> mapaProductosCliente = new HashMap<>();
        mapaProductosCliente.put(fantaNaranja, 1);
        mapaProductosCliente.put(levis501, 6);
        mapaProductosCliente.put(kitKat, 6);
        mapaProductosCliente.put(camiseta, 4);

        Cesta cestaCliente = new Cesta(mapaProductosCliente);

        return new Cliente("Marta Perez", cestaCliente);

    }


    public void menuAntiguos(){



//       Cesta cesta = new Cesta(new Producto[]{
//                new Bebida("Coca Cola", "Refresco de cola", 1.5, LocalDate.of(2024, 10, 20), 0.33),
//                new Bebida("Fanta", "Refresco de naranja", 1.5, LocalDate.of(2024, 10, 4), 0.33),
//               new Ropa("Camiseta", "Camiseta de manga corta", 10, "Camiseta", "M"),
//               new Ropa("Pantalón", "Pantalón vaquero", 20, "Pantalón", "M"),
//                new Comida("Manzana", "Manzana Golden", 1, LocalDate.of(2024, 5, 21), 0.2),
//                new Comida("Plátano", "Plátano de Canarias", 1, LocalDate.of(2024, 4, 2), 0.2),
//
//
//
//        });
//
//       Cesta cesta2 = new Cesta(new Producto[]{
//               new Bebida("Coca Cola", "Refresco de cola", 1.5, LocalDate.of(2024, 10, 20), 0.33),
//               new Bebida("Fanta", "Refresco de naranja", 1.5, LocalDate.of(2024, 10, 4), 0.33),
//               new Ropa("Camiseta", "Camiseta de manga corta", 10, "Camiseta", "M"),
//               new Ropa("Pantalón", "Pantalón vaquero", 20, "Pantalón", "M"),
//               new Comida("Manzana", "Manzana Golden", 1, LocalDate.of(2024, 5, 21), 0.2),
//               new Comida("Plátano", "Plátano de Canarias", 1, LocalDate.of(2024, 4, 2), 0.2),
//               new Bebida("Coca Cola", "Refresco de cola", 1.5, LocalDate.of(2024, 10, 20), 0.33),
//               new Bebida("Fanta", "Refresco de naranja", 1.5, LocalDate.of(2024, 10, 4), 0.33),
//               new Ropa("Camiseta", "Camiseta de manga corta", 10, "Camiseta", "M"),
//               new Ropa("Pantalón", "Pantalón vaquero", 20, "Pantalón", "M"),
//
//
//       });

        // Cliente cliente1 = new Cliente("Pepe", cesta);
/*        System.out.println("====================================");
        System.out.println(cliente1.getNombre());
        System.out.println(cliente1.getCesta().calcularImporteTotal());
        System.out.println(cliente1.getCesta().getListaProductos().length);
        System.out.println(cliente1.getCesta().getListaProductos()[0].getNombre());*/

        //  procesarCliente(cliente1);

        // Cliente cliente2 = new Cliente("Juan", cesta2);
/*
        System.out.println("====================================");
        System.out.println(cliente2.getNombre());
        System.out.println(cliente2.getCesta().calcularImporteTotal());
        System.out.println(cliente2.getCesta().getListaProductos().length);
        System.out.println(cliente2.getCesta().getListaProductos()[0].getNombre());

        System.out.println(cliente2.getId());*/

        //procesarCliente(cliente2);
    }


/*        public static void procesarCliente2(Cliente cliente){
        System.out.println("====================================");
        System.out.println("Cliente " + cliente.getNombre() + "con id " + cliente.getId());

        System.out.println("Contenido de la cesta del cliente : ");

            for (Producto producto : cliente.getCesta().getListaProductos()) {
                System.out.println(producto);
            }

        System.out.println("************************************");
        System.out.println("Importe total de la cesta : " + cliente.getCesta().calcularImporteTotal());
        System.out.println("************************************");




    }*/
    }

