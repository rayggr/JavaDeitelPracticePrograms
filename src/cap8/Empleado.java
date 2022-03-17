package cap8;

public class Empleado {
    private String nombre;
    private String apellido;
    private Fecha fechaNacimiento;
    private Fecha fechaContratacion;

    public Empleado(String nombre, String apellido, Fecha fechaNacimiento, Fecha fechaContratacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaContratacion = fechaContratacion;
    }

    @Override
    public String toString() {
        return String.format("%s, %s Contratado: %s Cumpleanios: %s", apellido,nombre,fechaContratacion,fechaNacimiento);
    }
}
