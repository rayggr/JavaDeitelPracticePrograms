package cap5;

public class Interes {
	public static void main(String[] args) {
		double monto;
		double principal = 5_000_000.0;
		double tasa = 0.015;

		System.out.printf("%s%20s%n", "Anio", "Monto en deposito");

		for (int anio = 1; anio <= 10; anio++) {
			monto = principal * Math.pow(1.0 + tasa, anio);
			System.out.printf("%-4d%,20.2f%n", anio, monto);
		}

	}
}
