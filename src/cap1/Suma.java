package cap1;

import java.util.Scanner;

public class Suma {
	public static void main(String[] args) {
		Scanner entradaScanner = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int suma;
		
		System.out.print("Escriba el primer entero: ");
		numero1 = entradaScanner.nextInt();
		
		System.out.print("Escriba el segundo entero: ");
		numero2 = entradaScanner.nextInt();
		
		suma = numero1 + numero2;
		
		System.out.printf("La suma es %d%n", suma);
	}

}
