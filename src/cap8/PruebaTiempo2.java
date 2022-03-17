package cap8;

public class PruebaTiempo2 {
    public static void main(String[] args) {
        Tiempo2 t1 = new Tiempo2();
        Tiempo2 t2 = new Tiempo2(2);
        Tiempo2 t3 = new Tiempo2(21,34);
        Tiempo2 t4 = new Tiempo2(12,25,42);
        Tiempo2 t5 = new Tiempo2(t4);
        System.out.println("Se contruyo con:");
        mostrarTiempo("t1: todos los argumentos predeterminados", t1);
        mostrarTiempo("t2: se especifico hora; minuto y segundo predeterminado", t2);
        mostrarTiempo("t3: se especifico hora,minuto; segundo predeterminado",t3);
        mostrarTiempo("t4: se especificarion hora, minuto y segundo",t4);
        mostrarTiempo("t5: se especifico el objeto Tiempo2 llamado t4",t5);

        try{
            Tiempo2 t6 = new Tiempo2(27,47,99);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public static void mostrarTiempo(String encabezado,Tiempo2 t){
        System.out.printf("%s%n  %s%n  %s%n",
                encabezado, t.aStringUniversal(), t.toString());
    }
}
