package cap9;

public class EmpleadoPorComision {
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;
    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision(String primerNombre, String apellidoPaterno,
                               String numeroSeguroSocial, double ventasBrutas, double tarifaComisión){
        if(ventasBrutas < 0.0)
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
        if(tarifaComisión <= 0.0 || tarifaComisión >= 1.0)
            throw new IllegalArgumentException("La tarifa de comision debe ser > 0.0 y <1.0");

        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComisión;
    }

    public String obtenerPrimerNombre(){
        return primerNombre;
    }
    public String obtenerApellidoPaterno(){
        return apellidoPaterno;
    }

    public String obtenerNumeroSeguroSocial(){
        return numeroSeguroSocial;
    }
    public void establecerVentasBrutas(double ventasBrutas){
            if(ventasBrutas <= 0.0)
                throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
            this.ventasBrutas = ventasBrutas;
    }

    public double ObtenerVentasBrutas(){
        return ventasBrutas;
    }

    public void establecerTarifaComision(double tarifaComisión){
        if(tarifaComisión <= 0.0 || tarifaComisión >= 1.0)
            throw new IllegalArgumentException("La tarifa de comision debe ser > 0.0 y < 1.0");
        this.tarifaComision = tarifaComisión;
    }

    public double obtenerTarifaComision(){
        return tarifaComision;
    }

    public double ingresos(){
        return tarifaComision * ventasBrutas;
    }

    public double obtenerVentasBrutas(){
        return ventasBrutas;
    }

    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "Empleado por comision",primerNombre,apellidoPaterno,"Numero de seguro social",numeroSeguroSocial,
                "Ventas brutas",ventasBrutas,"Tarifa de comisión", tarifaComision);
    }

}
