package cap9;

public class PruebaEmpleadoPorComision {
    public static void main(String[] args) {
        EmpleadoPorComision empleado = new EmpleadoPorComision(
                "Sue","Jones","222-22-222",1000,0.06);

        System.out.println("Informacion del empleado obtenida por los metodos establecer:");
        System.out.printf("%n%s %s%n","El primer nombres es",empleado.obtenerPrimerNombre());
        System.out.printf("%s %s%n","El apellido paterno es",empleado.obtenerApellidoPaterno());
        System.out.printf("%s %s%n","El numero de seguro social es", empleado.obtenerNumeroSeguroSocial());
        System.out.printf("%s %s%n","La tarifa de comision es ", empleado.obtenerTarifaComision());

        empleado.establecerVentasBrutas(500);
        empleado.establecerTarifaComision(0.1);
        System.out.printf("%n%s:%n%n%s%n","Informacion actualizada del empleado obtenida mediante toString",empleado);
    }
}
