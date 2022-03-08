package cap7;

public class PruebaLibroCalificacaciones {
	public static void main(String[] args) {
		int[][] arregloCalif = { { 65, 53, 70 }, { 34, 93, 56 }, { 45, 66, 75 }, { 87, 96, 68 }, { 86, 86, 47 },
				{ 78, 26, 76 }, { 87, 46, 81 }, { 77, 91, 53 }, { 84, 92, 95 } };
		LibroCalificacionesMejorado miLibro = new LibroCalificacionesMejorado(
				"CS101 Introduccion a la programacion en java", arregloCalif);
		miLibro.procesarCalificaciones();
	}

}
