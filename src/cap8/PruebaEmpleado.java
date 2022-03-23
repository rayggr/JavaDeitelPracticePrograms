package cap8;

public class PruebaEmpleado {

    public static void main(String[] args) {
        System.out.printf("Empleados antes de instanciar: %d%n", Empleado.obtenerCuenta());
        Empleado e1 = new Empleado("Susan","Baker");
        Empleado e2 = new Empleado("Bob","Sinclair");

        System.out.printf("%nEmpleados despues de instanciar%n");
        System.out.printf("mediante e1.obtenerCuenta():%d%n", e1.obtenerCuenta());
        System.out.printf("mediante e2.obtenerCuenta():%d%n",e2.obtenerCuenta());
    }
}
