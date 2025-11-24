package persona;

public class Empleado extends Persona {

    private String puesto;
    private double sueldo;

    public Empleado() {
        super();
    }

    public Empleado(String puesto, double sueldo) {
        super();
        this.puesto = puesto;
        this.sueldo = sueldo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
