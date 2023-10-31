import java.time.LocalDate;

public abstract class Consumible extends Producto {
    private LocalDate fechaCaducidad;


    public Consumible(String nombre, String descripcion, double precio, LocalDate fechaCaducidad) {
        super(nombre, descripcion, precio);
        this.fechaCaducidad = fechaCaducidad;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
}
