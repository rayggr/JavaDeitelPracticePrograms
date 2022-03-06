package cap6;

public class SobrecargaMetodos {

	public static void main(String[] args) {
		System.out.printf("El cuadrado del entero 7 es %d%n", cuadrado(7));
		System.out.printf("El cuadrado del double 7.5 es %f%n", cuadrado(7.5));
	}

	public static int cuadrado(int valorInt) {
		System.out.printf("%nSe llamo al cuadrado con argumento int %d%n", valorInt);
		return valorInt * valorInt;
	}

	public static double cuadrado(double valorDouble) {
		System.out.printf("%nSe llamo al cuadrado con argumento double %.2f%n", valorDouble);
		return valorDouble * valorDouble;
	}
}
