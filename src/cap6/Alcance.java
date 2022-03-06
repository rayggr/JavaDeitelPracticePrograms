package cap6;

public class Alcance {
	private static int x = 1;

	public static void main(String args[]) {
		int x = 5;
		System.out.printf("La x local en main es %d%n", x);
		usarVariableLocal();
		usarCampo();
		usarVariableLocal();
		usarCampo();

		System.out.printf("%nla x local en main es %d%n", x);
	}

	public static void usarVariableLocal() {
		int x = 25;
		System.out.printf("%nla x local al entar al metodo usarVariableLocal es %d%n", x);
		++x;
		System.out.printf("la x local antes de salir del metodo usarVariableLocal es %d%n", x);
	}

	public static void usarCampo() {
		System.out.printf("%nEl campo x al entrar al metodo usar Campo es %d%n", x);
		x *= 10;
		System.out.printf("El campo x antes de salir del metodo usarCampo %d%n", x);
	}

}
