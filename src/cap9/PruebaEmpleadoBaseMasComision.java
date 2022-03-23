package cap9;

public class PruebaEmpleadoBaseMasComision {
    public static void main(String[] args) {
        EmpleadoBaseMasComision empleado = new EmpleadoBaseMasComision("Bob","Lewis","333-33-333",500,0.04,300);
        System.out.println("Informacion del empleado obtenida por metodos establecer: \n");
        System.out.printf("%s %s%n","El primer nombre es", empleado.obtenerPrimerNombre());
        System.out.printf("%s %s%n","El apellido paterno es ", empleado.obtenerApellidoPaterno());
        System.out.printf("%s %s%n","El numero de seguro social es ", empleado.obtenerNumeroSeguroSocial());
        System.out.printf("%s %.2f%n","Las ventas brutas son ", empleado.obtenerVentasBrutas());
        System.out.printf("%s %.2f%n","La tarifa de comision es", empleado.obtenerTarifaComision());
        System.out.printf("%s %.2f%n","El salario base es",empleado.obtenerSalarioBase());

        empleado.establecerSalarioBase(1000);
        System.out.printf("%n%s: %n%n%s%n","Informacion actualizada del empleado, obtenida por toString",empleado);

    }
}
