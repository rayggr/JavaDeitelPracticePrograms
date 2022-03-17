package cap8;

public enum Libro {
    JHTP("Java how to program","2015"),
    CHTP("C How to program","2013"),
    IW3HTP("Internet & World wirde web hot to program","2012"),
    CPPHTP("C++ How to Program","2014"),
    VBHTP("Visual Basic how to program","2014"),
    CSHARPHTP("Visual c# how to program","2014");

    private final String titulo;
    private final String anioCopyright;

    Libro(String titulo,String anioCopyright){
        this.titulo = titulo;
        this.anioCopyright = anioCopyright;
    }

    public String obtenerTitulo(){
        return titulo;
    }
    public String obtenerAnioCopyright(){
        return anioCopyright;
    }
}
