package cap7;
public class IniciarArreglo {
	public static void main(String[] args) {
		int[] arreglo = { 10, 23, 42, 53, 53, 53, 384, 59 };
		System.out.printf("%s%8s%n", "Indice", "Valor");
		for (int contador = 0; contador < arreglo.length; contador++) {
			System.out.printf("%5d%8d%n", contador, arreglo[contador]);
		}
	}

}
