package cap7;

public class GraficoBarras {
	public static void main(String[] args) {
		int[] arreglo = { 0, 2, 5, 6, 7, 4, 1, 2, 4, 2, 1 };
		System.out.println("Distribucion de calificaciones: ");
		for (int contador = 0; contador < arreglo.length; contador++) {
			if (contador == 10)
				System.out.printf("%5d ", 100);
			else
				System.out.printf("%02d-%02d ", contador * 10, contador * 10 + 9);
			for (int estrellas = 0; estrellas < arreglo[contador]; estrellas++)
				System.out.print("*");
			System.out.println();
		}
	}

}
