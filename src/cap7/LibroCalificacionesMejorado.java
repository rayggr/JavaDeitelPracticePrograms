package cap7;

public class LibroCalificacionesMejorado {
	private String nombreDelCurso;
	private int[][] calificaciones;

	public LibroCalificacionesMejorado(String nombreDelCurso, int[][] calificaciones) {
		this.nombreDelCurso = nombreDelCurso;
		this.calificaciones = calificaciones;
	}

	public void establecerNombreDelCurso(String nombreDelCurso) {
		this.nombreDelCurso = nombreDelCurso;
	}

	public String obtenerNombreDelCurso() {
		return nombreDelCurso;
	}

	public void procesarCalificaciones() {
		imprimirCalificaciones();
		System.out.printf("%n%s %d%n%s %d%n%n", "La calificacion mas baja en el libro de calificaciones es",
				obtenerMinima(), "La calificacion mas alta en el libro calificaciones es", obtenerMaxima());

		imprimirGraficoBarras();
	}

	public int obtenerMinima() {
		int califBaja = calificaciones[0][0];
		for (int[] califEstudiantes : calificaciones) {
			for (int calificacion : califEstudiantes) {
				if (calificacion < califBaja)
					califBaja = calificacion;
			}
		}
		return califBaja;
	}

	public int obtenerMaxima() {
		int califAlta = calificaciones[0][0];
		for (int[] califEstudiantes : calificaciones) {
			for (int calificacion : califEstudiantes) {
				if (calificacion > califAlta)
					califAlta = calificacion;
			}
		}
		return califAlta;

	}

	public double obtenerPromedio(int[] conjuntoDeCalif) {
		int total = 0;
		for (int calificacion : conjuntoDeCalif)
			total += calificacion;

		return (double) total / conjuntoDeCalif.length;
	}

	public void imprimirGraficoBarras() {
		System.out.println("Distribucion de calificaciones en general:");

		int[] frecuencia = new int[11];

		for (int[] califEstudiantes : calificaciones) {
			for (int calificacion : califEstudiantes)
				++frecuencia[calificacion / 10];
		}
		for (int cuenta = 0; cuenta < frecuencia.length; cuenta++) {
			if (cuenta == 10)
				System.out.printf("%5d ", 100);
			else
				System.out.printf("%02d-%02d ", cuenta * 10, cuenta * 10 + 9);

			for (int estrellas = 0; estrellas < frecuencia[cuenta]; estrellas++)
				System.out.print("*");

			System.out.println("");
		}
	}

	public void imprimirCalificaciones() {
		System.out.printf("Las calificaciones son: %n%n");
		System.out.print("             ");
		for (int prueba = 0; prueba < calificaciones[0].length; prueba++)
			System.out.printf("Prueba %d  ", prueba + 1);

		System.out.println("Promedio");

		for (int estudiante = 0; estudiante < calificaciones.length; estudiante++) {
			System.out.printf("Estudiante %2d ", estudiante + 1);

			for (int prueba : calificaciones[estudiante])
				System.out.printf("%d", prueba);

			double promedio = obtenerPromedio(calificaciones[estudiante]);
			System.out.printf("%9.2f%n", promedio);

		}
	}
}
