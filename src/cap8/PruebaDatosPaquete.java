package cap8;

public class PruebaDatosPaquete {
    public static void main(String[] args) {
        DatosPaquete datosPaquete = new DatosPaquete();

        datosPaquete.numero = 77;
        datosPaquete.cadena = "Adios";

        System.out.printf("Despues de modificar los valores: " + datosPaquete);
    }
}
class DatosPaquete{
    int numero;
    String cadena = "Hola";

    @Override
    public String toString() {
        return "DatosPaquete{" +
                "numero=" + numero +
                ", cadena='" + cadena + '\'' +
                '}';
    }
}

