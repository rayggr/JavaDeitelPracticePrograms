package cap4;

public class PruebaEstudiante {
	public static void main(String[] args) {
		Estudiante cuenta1 = new Estudiante("Jane Green", 94.35);
		Estudiante cuenta2 = new Estudiante("John Blue", 72.38);

		System.out.printf("La calificacion en letra de %s es %s%n", cuenta1.obtenerNombre(),
				cuenta1.obtenerCalificacionEstudiante());
		System.out.printf("La calificacion en letra de %s es %s%n", cuenta2.obtenerNombre(),
				cuenta2.obtenerCalificacionEstudiante());

	}

}
