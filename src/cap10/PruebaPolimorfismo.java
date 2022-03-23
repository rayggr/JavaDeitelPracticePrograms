package cap10;

import cap9.EmpleadoBaseMasComision;
import cap9.EmpleadoPorComision;

public class PruebaPolimorfismo {
    public static void main(String[] args) {
        EmpleadoPorComision empleadoPorComision = new EmpleadoBaseMasComision(
                "Sue","Johnes","222-22-222",10000,0.06,10000);
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision(
                "Bob","Lewis","333-33-333",5000,0.4,300
        );

        System.out.printf("%s %s:%n%n%s%n%n",
                "Llamada a toString de EmpleadoBaseMasComision con referencia",
                "de subclase a un objeto de la subclase",
                empleadoBaseMasComision.toString());

        EmpleadoPorComision empleadoPorcomision2 = empleadoBaseMasComision;

        System.out.printf("%s %s:%n%n%s%n",
                "Llamada a toString de EmpleadoBaseMasComision con referencia de superclase",
                "a un objecto de la subclase", empleadoPorcomision2.toString()
        );




    }
}
