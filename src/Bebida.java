import java.time.LocalDate;

public class Bebida extends Consumible{

    private double volumen;

    public Bebida(String nombre, String descripcion, double precio, LocalDate fechaCaducidad, double volumen) {
        super(nombre, descripcion, precio, fechaCaducidad);
        this.volumen = volumen;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
}
