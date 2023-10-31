import java.time.LocalDate;

public class Ropa extends Producto {
    private String tipo;
    private String talla;


    public Ropa(String nombre, String descripcion, double precio, String tipo, String talla) {
        super(nombre, descripcion, precio);
        this.tipo = tipo;
        this.talla = talla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Ropa{" +
                "tipo='" + tipo + '\'' +
                ", talla='" + talla + '\'' +
                "} " + super.toString();
    }
}

