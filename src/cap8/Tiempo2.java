package cap8;

public class Tiempo2 {
    private int hora;
    private int minuto;
    private int segundo;

    public Tiempo2(){
        this(0,0,0);
    }
    public Tiempo2(int hora){
        this(hora,0,0);
    }
    public Tiempo2(int hora, int minuto){
        this(hora,minuto,0);
    }
    public Tiempo2(int hora, int minuto, int segundo){
        if( hora < 0 || hora >= 24)
            throw new IllegalArgumentException("La hora debe estar entre 0 y 23");
        if( minuto <0 || minuto >= 60)
            throw new IllegalArgumentException("Minuto debe estar entre 0 y 59");
        if(segundo< 0 || segundo >= 60)
            throw new IllegalArgumentException("Segundo debe estar entre 0 y 59");
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;

    }

    public Tiempo2(Tiempo2 tiempo2){
        this(tiempo2.obtenerHora(), tiempo2.obtenerMinuto(),tiempo2.obtenerSegundo());
    }

    public void establecerTiempo(int hora, int minuto, int segundo) {
        if (hora < 0 || hora >= 24)
            throw new IllegalArgumentException("Hora debe estar entre 0 y 23");
        if (minuto < 0 || minuto >= 60)
            throw new IllegalArgumentException("Minuto debe estar entre 0 y 59");
        if (segundo < 0 || minuto >= 60)
            throw new IllegalArgumentException("Segundo debe estar entre 60 y 59");
        this.hora = hora;
        this.segundo = segundo;
        this.minuto = minuto;
    }

    public void establecerHora(int hora){
        if( hora < 0 || hora >= 24)
            throw new IllegalArgumentException("hora debe estar entre 0 y 23");
        this.hora = hora;
    }

    public void establecerMinuto(int minuto){
        if(minuto < 0 || minuto >= 60)
            throw new IllegalArgumentException("Minuto debe estar entre 0 y 59");
        this.minuto = minuto;
    }

    public void establecerSegundo(int segundo){
        if(segundo <0 || segundo>= 60)
            throw new IllegalArgumentException("Segundo debe estar entre 0 y 59");
        this.segundo = segundo;
    }

    //Getters

    public int obtenerHora(){
        return hora;
    }
    public int obtenerMinuto(){
        return minuto;
    }
    public int obtenerSegundo(){
        return segundo;
    }


    public String aStringUniversal(){
        return String.format("%02d:%02d:%02d",obtenerHora(),obtenerMinuto(),obtenerSegundo());
    }

    @Override
    public String toString(){
        return String.format("%d:%02d:%02d %s",
                ((obtenerHora() == 0 || obtenerHora() == 12) ? 12 : obtenerHora()),obtenerMinuto(),obtenerSegundo(), (obtenerHora() < 12 ? "AM":"PM"));

    }
}


