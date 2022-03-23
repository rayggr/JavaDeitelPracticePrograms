package cap10;

public class PruebaSistemaNomina {
    public static void main(String[] args) {
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado(
                "John","Smith","111-11-111",800.00
        );
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras(
          "Karen","Price","222-22-222",16.75,40
        );
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision(
                "Sue","Jones","333-33-333",10000,0.06
        );
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision(
                "Bob","Lewis","444-44-4444",5000,0.04,300
        );

        System.out.println("Empleados procesados por separado");
        System.out.printf("%n%s%n%s: $%,.2f%n%n",
                empleadoAsalariado, "ingresos",empleadoAsalariado.ingresos());
        System.out.printf("%n%s%n%s: $%,.2f%n%n",
                empleadoPorHoras, "ingresos",empleadoPorHoras.ingresos());
        System.out.printf("%n%s%n%s: $%,.2f%n%n",
                empleadoPorComision, "ingresos",empleadoPorComision.ingresos());
        System.out.printf("%n%s%n%s: $%,.2f%n%n",
                empleadoBaseMasComision, "ingresos",empleadoBaseMasComision.ingresos());

        Empleado[] empleados = new Empleado[4];
        empleados[0] = empleadoAsalariado;
        empleados[1] = empleadoPorHoras;
        empleados[2] = empleadoPorComision;
        empleados[3] = empleadoBaseMasComision;

        System.out.printf("Empleados procesados en forma poliformica:%n%n");
        for(Empleado empleadosActual: empleados){
            System.out.println(empleadosActual);

            if(empleadosActual instanceof EmpleadoBaseMasComision){
                EmpleadoBaseMasComision empleado  = (EmpleadoBaseMasComision) empleadosActual;
                empleado.establecerSalarioBase(1.10 + empleado.obtenerSalarioBase());
                System.out.printf(
                        "El nuevo salario base con 10%% de aumento es : $%,.2f%n",
                        empleado.obtenerSalarioBase()
                );
            }

            System.out.printf("Ingresos $%,.2f%n%n",empleadosActual.ingresos());
        }

        for (int j = 0; j <empleados.length; j++){
            System.out.printf("El empelado %d es un %s %n",j, empleados[j].getClass().getName());
        }
    }
}
