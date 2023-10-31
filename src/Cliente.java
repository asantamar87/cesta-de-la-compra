public class Cliente {

    private int id;
    private String nombre;
    private Cesta cesta;
    private static int contadorId = 1;


    public Cliente(String nombre, Cesta cesta) {
        this.nombre = nombre;
        this.cesta = cesta;
        this.id = contadorId;
        contadorId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cesta getCesta() {
        return cesta;
    }

    public void setCesta(Cesta cesta) {
        this.cesta = cesta;
    }

    public static int getContadorId() {
        return contadorId;
    }

    public static void setContadorId(int contadorId) {
        Cliente.contadorId = contadorId;
    }
}
