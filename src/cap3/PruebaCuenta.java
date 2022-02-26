package cap3;

import java.util.Locale;
import java.util.Scanner;

public class PruebaCuenta {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
		Cuenta cuenta1 = new Cuenta("Jane Green",50.00);
		Cuenta cuenta2 = new Cuenta("John Blue", -7.55);
		
		System.out.printf("Saldo de %s: $%.2f%n",cuenta1.obtenerNombre(),cuenta1.obtenerSaldo());
		System.out.printf("Saldo de %s: $%.2f%n",cuenta2.obtenerNombre(),cuenta2.obtenerSaldo());

		System.out.print("Escriba el monto a depositar para cuenta1: ");
		double montoDeposito = entrada.nextDouble();
		cuenta1.depositar(montoDeposito);
		System.out.printf("%nSumando %.2f al saldo de cuenta %n%n" , montoDeposito);
		
		System.out.printf("Saldo de %s: $%.2f%n", cuenta1.obtenerNombre(),cuenta1.obtenerSaldo());
		System.out.printf("Saldo de %s: $%.2f%n", cuenta2.obtenerNombre(),cuenta2.obtenerSaldo());
		
		System.out.print("Escriba el monto a depositar para cuenta2: ");
		montoDeposito = entrada.nextDouble();
		cuenta2.depositar(montoDeposito);
		System.out.printf("%nSumando %.2f al saldo de cuanta1 %n%n" , montoDeposito);
		
		System.out.printf("Saldo de %s: $%.2f%n", cuenta1.obtenerNombre(),cuenta1.obtenerSaldo());
		System.out.printf("Saldo de %s: $%.2f%n", cuenta2.obtenerNombre(),cuenta2.obtenerSaldo());
		
		
	}

}