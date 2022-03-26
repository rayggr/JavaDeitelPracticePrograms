package cap10;

public class PruebaInterfazPagar {
    public static void main(String[] args) {
        PorPagar[] objetosPorPagar = new PorPagar[4];

        objetosPorPagar[0] = new Factura("01234","asiento",2,375.00);
        objetosPorPagar[1] = new Factura("57483","llanta",4,79.95);
        objetosPorPagar[2] = new EmpleadoAsalariado("John","Smith","111-11-111",800.00);
        objetosPorPagar[3] = new EmpleadoAsalariado("Lisa","Barnes","888-88-888",1200.00);

        System.out.println("Facturas y Empleados procesados en forma polimorfica");

        for(PorPagar porPagarActual: objetosPorPagar){
            System.out.printf("%n%s %n%s: $%,.2f%n",
                    porPagarActual.toString(),
                    "pago vencido",porPagarActual.obtenerMontoPago());
        }
    }
}
