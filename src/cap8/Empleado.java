package cap8;

public class Empleado {
    private static int cuenta = 0;

    private String nombre;
    private String apellido;
    private Fecha fechaNacimiento;
    private Fecha fechaContratacion;

    public Empleado(String nombre, String apellido){
        ++cuenta;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Empleado(String nombre, String apellido, Fecha fechaNacimiento, Fecha fechaContratacion) {
        ++cuenta;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaContratacion = fechaContratacion;
    }

    @Override
    public String toString() {
        return String.format("%s, %s Contratado: %s Cumpleanios: %s", apellido,nombre,fechaContratacion,fechaNacimiento);
    }

    public static int obtenerCuenta(){
        return cuenta;
    }
}
