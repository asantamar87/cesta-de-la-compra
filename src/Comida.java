import java.time.LocalDate;

public class Comida extends Consumible{

   private double pesoNeto;


    public Comida(String nombre, String descripcion, double precio, LocalDate fechaCaducidad, double pesoNeto) {
        super(nombre, descripcion, precio, fechaCaducidad);
        this.pesoNeto = pesoNeto;
    }

    public double getPesoNeto() {
        return pesoNeto;
    }

    public void setPesoNeto(double pesoNeto) {
        this.pesoNeto = pesoNeto;
    }
}
