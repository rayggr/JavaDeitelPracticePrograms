package cap8;

public class Fecha {
    private int mes;
    private int dia;
    private int anio;

    private static final int[] diasPorMes = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    public Fecha(int mes, int dia, int anio){
        if(mes <=0 || mes > 12)
            throw new IllegalArgumentException("mes("+mes +") debe ser 1-12");

        if(dia <= 0 || (dia > diasPorMes[mes] && !(mes == 2 && dia == 29)))
            throw new IllegalArgumentException("dia("+ dia +") fuera de rango para el mes y anio especificados");

        if(mes == 2 && dia == 29 && !(anio % 400 == 0 || (anio %4 == 0 && anio % 100 != 0)))
            throw new IllegalArgumentException("dia ( " + dia + ") fuera de rango para el mes y anio especificados");

        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
        System.out.printf("Constructor de objeto FEcha para la fecha %s%n", this);
    }

    public String toString(){
        return String.format("%d/%d/%d",mes, dia, anio);
    }

}
