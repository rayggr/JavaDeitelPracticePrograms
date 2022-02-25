package cap2;

import java.util.Scanner;

public class PruebaCuenta {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Cuenta miCuenta = new Cuenta();
		System.out.printf("El nombre inicial es %s%n%n",miCuenta.obtenerNombre());
		
		System.out.print("Introduzca el nombre: ");
		String elNombre = entrada.nextLine();
		miCuenta.establecerNombre(elNombre);
		System.out.println();
		
		System.out.printf("El nombre en el objeto miCuenta es: %n%s%n",miCuenta.obtenerNombre());
		System.out.println();
		System.out.println("Test de scanner ingresando datos con espacio y metodo next");
		
		String inp1;
		String inp2;
		
		System.out.print("Ingrese dos palabras separadas por espacios:");
		inp1 = entrada.next();
		inp2 = entrada.next();
		
		System.out.printf("El valor final de inp1 es %s y el de inp2 es %s",inp1,inp2);
	}

}
