package cap5;

public class PrubaPolizaAuto {
	public static void main(String[] args) {
		PolizaAuto poliza1 = new PolizaAuto(111111, "Toyota Camry", "NJ");
		PolizaAuto poliza2 = new PolizaAuto(222222, "Ford Fushion", "ME");

		polizaEstadoSinCulpa(poliza1);
		polizaEstadoSinCulpa(poliza2);
	}

	public static void polizaEstadoSinCulpa(PolizaAuto poliza) {
		System.out.println("La poliza del auto: ");
		System.out.printf("Cuenta #: %d; Auto: %s; Estado %s %s un estado sin culpa %n%n", poliza.obtenerNumeroCuenta(),
				poliza.obtenerMarcaYModelo(), poliza.obtenerEstado(),
				(poliza.esEstadoSinCulpa() ? "esta en " : "no esta en "));
	}

}
